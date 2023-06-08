package com.example.quoetsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class loginActivity extends AppCompatActivity {

    ImageView imgBack;

    AppCompatButton btnlogin;

    TextInputEditText txtEmail , textPassword;

    String email , password ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initview();
    }

    private void initview() {

        imgBack=findViewById(R.id.imgBack);

        btnlogin = findViewById(R.id.btnlogin) ;

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(loginActivity.this,CategoryActivity.class);
                startActivity(i);
            }
        });


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String  email = txtEmail.getText().toString();
                String password = textPassword.getText().toString();

                if(email.isEmpty())
                {
                    Toast.makeText(loginActivity.this, "Please Enter Your Emial", Toast.LENGTH_SHORT).show();
                }
                else if (password.isEmpty())
                {
                    Toast.makeText(loginActivity.this, "Please Enter Your Phone Number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent i = new Intent(loginActivity.this,CategoryActivity.class);
                    startActivity(i);
                }

            }
        });

    }
}