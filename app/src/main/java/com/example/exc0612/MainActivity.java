package com.example.exc0612;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        text = findViewById(R.id.text);
    }
    int counter = 0 ;
    public void ace(View view) {
        text.setTextColor(Color.RED);
        counter += 1 ;
        text.setText("This is a click number:" + counter);
    }
}