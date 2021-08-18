package com.example.nextapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class sign_up extends AppCompatActivity {
    com.google.android.material.textfield.TextInputEditText tfFull_Name , tfNew_User , tfEmail , tfPhone ,tfPassword;
    Button btnSign_up;
   TextView tvOld_user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.sign_up);
        tfEmail = findViewById(R.id.tfEmail);
        tfFull_Name = findViewById(R.id.tfFull_Name);
        tfNew_User = findViewById(R.id.tvNew_User);
        tfPassword= findViewById(R.id.tfPassword);
        tfPhone = findViewById(R.id.tfPassword);
        btnSign_up=findViewById(R.id.btnSign_up);
        tvOld_user = findViewById(R.id.tvOld_user);

        tvOld_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.example.nextapp.sign_up.this,com.example.nextapp.login.class);
                startActivity(intent);
            }
        });
        btnSign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}