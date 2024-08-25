package com.codewithprem;

import static com.codewithprem.R.id.addButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHelper db = new DBHelper(this);

        Button addBtn = findViewById(R.id.addButton);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nameEditText = findViewById(R.id.editName);
                EditText phoneEditText = findViewById(R.id.editPhone);
                EditText emailEditText = findViewById(R.id.editEmailAddress);
                EditText addressEditText = findViewById(R.id.editCity);

                String name, phone, email, address;
                name = nameEditText.getText().toString();
                phone = phoneEditText.getText().toString();
                email = emailEditText.getText().toString();
                address = addressEditText.getText().toString();

                db.createContact(name, phone, email, address);

                Toast.makeText(MainActivity.this, "Contact Added", Toast.LENGTH_SHORT).show();
            }
        });

    }
}