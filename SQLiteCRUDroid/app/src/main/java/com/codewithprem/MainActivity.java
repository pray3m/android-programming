package com.codewithprem;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try (DbHelper dbHelper = new DbHelper(this)) {

            EditText id = findViewById(R.id.edit_text_id);
            EditText name = findViewById(R.id.edit_text_name);
            EditText address = findViewById(R.id.edit_text_address);

            Button btnInsert = findViewById(R.id.insert_button);
            Button btnSelect = findViewById(R.id.select_button);
            Button btnUpdate = findViewById(R.id.update_button);
            Button btnDelete = findViewById(R.id.delete_button);

            RecyclerView recyclerView = findViewById(R.id.recycler_view);

            btnInsert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String idText = id.getText().toString();
                    String nameText = name.getText().toString();
                    String addressText = address.getText().toString();

                    dbHelper.insertData(idText, nameText, addressText);
                    Toast.makeText(MainActivity.this, "Inserted succcessfully ✅", Toast.LENGTH_LONG).show();
                }
            });

            btnSelect.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ArrayList<Contact> contacts = new ArrayList<Contact>();

                    Cursor cursor = dbHelper.getData();
                    while (cursor.moveToNext()) {
                        int id = cursor.getInt(0);
                        String name = cursor.getString(1);
                        String address = cursor.getString(2);
                        Contact contact = new Contact(id, name, address);
                        contacts.add(contact);
                    }

                    // plotting in recycler view
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
                    recyclerView.setLayoutManager(layoutManager);
                    ContactAdapter adapter = new ContactAdapter(MainActivity.this, contacts);
                    recyclerView.setAdapter(adapter);
                }
            });

            btnUpdate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String idText = id.getText().toString();
                    String nameText = name.getText().toString();
                    String addressText = address.getText().toString();

                    dbHelper.updateData(idText, nameText, addressText);
                    Toast.makeText(MainActivity.this, "updated succcessfully ✅", Toast.LENGTH_LONG).show();
                }
            });

            btnDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String idText = id.getText().toString();

                    dbHelper.deleteData(idText);
                    Toast.makeText(MainActivity.this, "Deleted succcessfully ✅", Toast.LENGTH_LONG).show();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}