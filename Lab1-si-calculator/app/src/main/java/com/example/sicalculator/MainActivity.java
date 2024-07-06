package com.example.sicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputPrincipal;
    private EditText inputTime;
    private EditText inputRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputPrincipal = findViewById(R.id.editTextPrincipal);
        inputTime = findViewById(R.id.editTextTime);
        inputRate = findViewById(R.id.editTextRate);
        Button btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);

                double principal = Double.parseDouble(inputPrincipal.getText().toString());
                double time = Double.parseDouble(inputTime.getText().toString());
                double rate = Double.parseDouble(inputRate.getText().toString());

                double interest = principal * time * rate / 100;
                intent.putExtra("interest", interest);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        // clear the input fields
        inputPrincipal.setText("");
        inputTime.setText("");
        inputRate.setText("");
    }
}