package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Contact> contactList;
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the reference of the RecyclerView
        recyclerView = findViewById(R.id.recyclerview);

        // set the layout manager of the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // create a list of contacts
        contactList = new ArrayList<>();
        contactList.add(new Contact("John Doe", "123456789", R.drawable.profile));
        contactList.add(new Contact("Jane Smith", "987654321", R.drawable.profile));
        contactList.add(new Contact("Bob Johnson", "555555555", R.drawable.profile));
        contactList.add(new Contact("Alice Brown", "111111111", R.drawable.profile));
        contactList.add(new Contact("Tom Wilson", "222222222", R.drawable.profile));
        contactList.add(new Contact("Sara Lee", "333333333", R.drawable.profile));
        contactList.add(new Contact("Mike Davis", "444444444", R.drawable.profile));
        contactList.add(new Contact("Emily Chen", "666666666", R.drawable.profile));
        contactList.add(new Contact("David Kim", "777777777", R.drawable.profile));
        contactList.add(new Contact("Lisa Garcia", "888888888", R.drawable.profile));
        contactList.add(new Contact("Chris Lee", "999999999", R.drawable.profile));
        contactList.add(new Contact("Karen Chen", "101010101", R.drawable.profile));
        contactList.add(new Contact("Brian Lee", "121212121", R.drawable.profile));

        // create an adapter and set it to the RecyclerView
        adapter = new RecyclerViewAdapter(this, contactList);
        recyclerView.setAdapter(adapter);
    }
}