package com.example.nextapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        com.google.android.material.textfield.TextInputEditText tfUser , tfPass;
        TextView tvForget_Pass , tvNew_User ;
        Button btnSign_In;

        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.login);
        tfPass = findViewById(R.id.tfPass);
        tfUser =findViewById(R.id.tfUser);
        tvForget_Pass = findViewById(R.id.tvForget_Pass);
        tvNew_User = findViewById(R.id.tvNew_User);
        btnSign_In = findViewById(R.id.btnSign_In);


        tvNew_User.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(com.example.nextapp.login.this , com.example.nextapp.sign_up.class);




                startActivity(intent);
            }
        });
        tvForget_Pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnSign_In.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}




