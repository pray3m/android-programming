package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView nameTextView;
    public TextView numberTextView;
    public ImageView imageView;

    public ViewHolder(View itemView) {
        super(itemView);
        nameTextView = itemView.findViewById(R.id.textView);
        numberTextView = itemView.findViewById(R.id.textView2);
        imageView = itemView.findViewById(R.id.imageView);
    }
}
