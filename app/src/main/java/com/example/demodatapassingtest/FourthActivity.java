package com.example.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvAnswerDbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAnswerDbl = findViewById(R.id.textView4);
        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("Dbl", 0);
        tvAnswerDbl.setText("Double value received is " + value);
    }
}