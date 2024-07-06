package com.example.sicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;
import java.util.Locale;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultTextView = findViewById(R.id.textResultView);
        Button backButton = findViewById(R.id.buttonBack);

        double interest = getIntent().getDoubleExtra("interest", 0.0);

        // format the interest as currency
        String formattedInterest = NumberFormat.getCurrencyInstance(Locale.getDefault()).format(interest);
        resultTextView.setText(formattedInterest);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}