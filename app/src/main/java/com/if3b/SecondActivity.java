package com.if3b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView TVnama;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setTitle("Layout B");

        TVnama = (findViewById(R.id.TV_nama));

        Intent terima = getIntent();
        String yNama = terima.getStringExtra("xNama");
        TVnama.setText(yNama);








    }
}