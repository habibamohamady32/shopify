package com.example.nextapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class sign_up extends AppCompatActivity {
    com.google.android.material.textfield.TextInputLayout tfFull_Name_ , tfNew_User_ , tfEmail_ , tfPhone_ ,tfPassword_;
    Button btnSign_up;
   TextView tvOld_user;
   DatabaseReference reference;
    String fullName,userName,phoneNo,Email,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.sign_up);
        tfEmail_ = findViewById(R.id.tfEmail_);
        tfFull_Name_ = findViewById(R.id.tfFull_Name_);
        tfNew_User_ = findViewById(R.id.tfNew_User_);
        tfPassword_= findViewById(R.id.tfPassword_);
        tfPhone_ = findViewById(R.id.tfPhone_);
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

                if(tfEmail_.getEditText().getText().toString().isEmpty()||
                        tfFull_Name_.getEditText().getText().toString().isEmpty()||
                        tfNew_User_.getEditText().getText().toString().isEmpty()||
                        tfPassword_.getEditText().getText().toString().isEmpty()||
                        tfPhone_.getEditText().getText().toString().isEmpty()){
                    Toast.makeText(sign_up.this, "Enter All Fields !", Toast.LENGTH_SHORT).show();
                }
                else{
                    reference= FirebaseDatabase.getInstance().getReference().child("users");
                    fullName =tfFull_Name_.getEditText().getText().toString().trim();
                    userName =tfNew_User_.getEditText().getText().toString().trim();
                    Email= tfEmail_.getEditText().getText().toString().trim();
                    phoneNo = tfPhone_.getEditText().getText().toString().trim();
                    password = tfPassword_.getEditText().getText().toString().trim();
                    User users = new User(fullName, userName,phoneNo,Email,password);
                    reference.child(phoneNo).push().setValue(users);

                Intent intent = new Intent(com.example.nextapp.sign_up.this,com.example.nextapp.home.class);
                startActivity(intent);
                }

            }
        });
    }
}