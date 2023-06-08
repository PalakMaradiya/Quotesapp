package com.example.quoetsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class SignupActivity extends AppCompatActivity {
    ImageView imgBack;
    String fname, lastname, email, phonenumber, password;
    AppCompatButton btnSiganup2;

    TextView tetlogin;
    TextInputEditText textFirstname, txtLastname, txtEmail, txtPhoneNumber, txtpassWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initview();
    }

    private void initview() {


        imgBack = findViewById(R.id.imgBack);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignupActivity.this, LoginScreenActivity.class);
                startActivity(i);
            }
        });


        btnSiganup2 = findViewById(R.id.btnSiganup2);

        textFirstname = findViewById(R.id.textFirstname);
        txtLastname = findViewById(R.id.txtLastname);
        txtEmail = findViewById(R.id.txtEmail);
        txtPhoneNumber = findViewById(R.id.txtPhoneNumber);
        txtpassWord = findViewById(R.id.txtpassWord);
        tetlogin = findViewById(R.id.tetlogin);
        btnSiganup2 = findViewById(R.id.btnSiganup2);

        btnSiganup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                fname = textFirstname.getText().toString();
                lastname = txtLastname.getText().toString();
                email = txtEmail.getText().toString();
                phonenumber = txtPhoneNumber.getText().toString();
                password = txtpassWord.getText().toString();


                if (fname.isEmpty()) {
                    Toast.makeText(SignupActivity.this, "Please Enter Your First Name ", Toast.LENGTH_SHORT).show();
                } else if (lastname.isEmpty()) {
                    Toast.makeText(SignupActivity.this, "Please Enter Your Last Name ", Toast.LENGTH_SHORT).show();
                } else if (email.isEmpty()) {
                    Toast.makeText(SignupActivity.this, "Please Enter Your Email Name ", Toast.LENGTH_SHORT).show();
                } else if (phonenumber.isEmpty()) {
                    Toast.makeText(SignupActivity.this, "Please Enter Your Phone Number Name ", Toast.LENGTH_SHORT).show();
                } else if (password.isEmpty()) {
                    Toast.makeText(SignupActivity.this, "Please Enter Your Password Name ", Toast.LENGTH_SHORT).show();
                } else {

                    // Toast.makeText(SignupActivity.this, "Your Account create Succefully ", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(SignupActivity.this, CategoryActivity.class);
                    startActivity(i);

                }
            }
        });


        tetlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(SignupActivity.this, loginActivity.class);
                startActivity(i);
            }
        });


    }
}