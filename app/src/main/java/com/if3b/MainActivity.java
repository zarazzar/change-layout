package com.if3b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnPindah;
    EditText ETnama;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        String nama = ETnama.getText().toString();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Layout A");

        ETnama = (EditText) findViewById(R.id.ET_nama);

        btnPindah = findViewById(R.id.btn_pindah);

        if(nama.trim().equals(""))
        {
            ETnama.setError("Nama Harus DiISi!!!");
        }

        btnPindah.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Intent pindah = new Intent(MainActivity.this, SecondActivity.class );
                    pindah.putExtra("xNama", nama);

                    startActivity(pindah);

                }
            });
    }
}