package com.codewithprem;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {
    Context context;
    ArrayList<Contact> data;


    public ContactAdapter(Context context, ArrayList<Contact> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.contact_item, parent, false);
        ViewHolder holder = new ViewHolder(contactView);
        return holder;
    }

    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d("ContactAdapter", "Binding position: " + position);
        Contact contact = data.get(position);
        holder.idView.setText(String.valueOf(contact.getId()));
        holder.nameView.setText(contact.getName());
        holder.addressView.setText(contact.getAddress());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView idView, nameView, addressView;

        public ViewHolder(View itemView) {
            super(itemView);
            idView = itemView.findViewById(R.id.id_view);
            nameView = itemView.findViewById(R.id.name_view);
            addressView = itemView.findViewById(R.id.address_view);
        }
    }

}
