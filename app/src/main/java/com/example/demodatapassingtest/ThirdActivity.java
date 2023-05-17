package com.example.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvAnswerChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAnswerChar = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        String value = intentReceived.getStringExtra("Char");
        tvAnswerChar.setText("Character value received is: " + value);


    }
}