package com.example.quoetsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class intro2 extends AppCompatActivity {

    AppCompatButton btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro2);
        initview();
    }

    private void initview() {

        btnNext = findViewById(R.id.btnNext);

        btnNext . setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(intro2.this,intro3.class);
                startActivity(i);
            }
        });

    }
}