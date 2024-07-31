package com.codewithprem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter extends BaseAdapter {
    Context context;
    private List<Student> students;
    private LayoutInflater inflater;

    public StudentAdapter(Context context, List<Student> students) {
        this.context = context;
        this.students = students;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int position) {
        return students.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.grid_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textName = convertView.findViewById(R.id.textName);
        TextView textAddress = convertView.findViewById(R.id.textAddress);

        Student student = students.get(position);
        imageView.setImageResource(student.getImageResId());
        textName.setText(student.getName());
        textAddress.setText(student.getAddress());

        return convertView;
    }
}
