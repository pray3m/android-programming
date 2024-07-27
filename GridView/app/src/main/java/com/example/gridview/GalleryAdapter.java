package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GalleryAdapter extends BaseAdapter {
    private Context context;
    private List<GalleryItem> galleryItems;

    public GalleryAdapter(Context context, List<GalleryItem> galleryItems) {
        this.context = context;
        this.galleryItems = galleryItems;
    }

    @Override
    public int getCount() {
        return galleryItems.size();
    }

    @Override
    public Object getItem(int position) {
        return galleryItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.image);
        TextView titleView = convertView.findViewById(R.id.title);
        TextView descriptionView = convertView.findViewById(R.id.description);

        GalleryItem item = galleryItems.get(position);
        imageView.setImageResource(item.getImageResId());
        titleView.setText(item.getTitle());
        descriptionView.setText(item.getDescription());
        return convertView;
    }
}
