package com.example;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLinear = findViewById(R.id.btn_linear);
        btnLinear.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LinearLayoutActivity.class);
            startActivity(intent);
        });

        Button btnRelative = findViewById(R.id.btn_relative);
        btnRelative.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
            startActivity(intent);
        });


        Button btnTable = findViewById(R.id.btn_table);
        btnTable.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TableLayoutActivity.class);
            startActivity(intent);
        });

        Button btnAbsolute = findViewById(R.id.btn_absolute);
        btnAbsolute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AbsoluteLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button btnConstraint = findViewById(R.id.btn_constraint);
        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConstraintLayoutActivity.class);
                startActivity(intent);
            }
        });
    }
}