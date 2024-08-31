package com.codewithprem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try (DbHelper dbHelper = new DbHelper(this)) {

            Button btnInsert = findViewById(R.id.insert_button);
            EditText id = findViewById(R.id.edit_text_id);
            EditText name = findViewById(R.id.edit_text_name);
            EditText address = findViewById(R.id.edit_text_address);

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
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}