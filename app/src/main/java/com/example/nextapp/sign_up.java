package com.example.nextapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class sign_up extends AppCompatActivity {
    com.google.android.material.textfield.TextInputLayout tfNew_User_ , tfEmail_ , tfPhone_ ,tfPassword_;
    Button btnSign_up;
   TextView tvOld_user;
   private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.sign_up);
        auth=FirebaseAuth.getInstance();
        tfEmail_ = findViewById(R.id.tfEmail_);
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

    }
    public void signup(View view) {
        String username=tfNew_User_.getEditText().toString();
        String password=tfPassword_.getEditText().toString();
        String email=tfEmail_.getEditText().toString();
        String phonenum=tfPhone_.getEditText().toString();
        if(TextUtils.isEmpty(username))
        {
            Toast.makeText(this,"Enter Name!",Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(password))
        {
            Toast.makeText(this,"Enter Password!",Toast.LENGTH_SHORT).show();
            return;
        }

        if(password.length()<6)
        {
            Toast.makeText(this,"Password too short, enter minimum 6 characters!",Toast.LENGTH_SHORT).show();
            return;
        }


        if(TextUtils.isEmpty(email))
        {
            Toast.makeText(this,"Enter Email!",Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(phonenum))
        {
            Toast.makeText(this,"Enter Phone Number!",Toast.LENGTH_SHORT).show();
            return;
        }

        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(sign_up.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(sign_up.this,"Regiestered Successfully!",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(sign_up.this,MainActivity.class));

                }
                else
                {
                    Toast.makeText(sign_up.this,"Registration Failed"+task.getException(),Toast.LENGTH_SHORT).show();
                }
            }
        });

        //startActivity(new Intent(sign_up.this,MainActivity.class));

    }
}