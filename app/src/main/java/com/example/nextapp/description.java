package com.example.nextapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class description extends AppCompatActivity {
    ImageView iv_;
    TextView tv_desc , tv_long_desc;
    Button btn_toCart;
    String image,desc;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Cart");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        iv_ = findViewById(R.id.iv_);
        tv_desc = findViewById(R.id.tv_desc);
        tv_long_desc = findViewById(R.id.tv_long_desc);
        btn_toCart = findViewById(R.id.btAddToCart);

        desc=getIntent().getStringExtra("desc").toString();
        tv_desc.setText(desc);
        image=getIntent().getStringExtra("imageDet").toString();
        if(image.equals("h1"))
        {
            iv_.setImageResource(R.drawable.h1);
        }
        else if(image.equals("h2"))
        {
            iv_.setImageResource(R.drawable.h2);
        }
        else if(image.equals("h6"))
        {
            iv_.setImageResource(R.drawable.h6);
        }
      btn_toCart.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              myRef.setValue("Name",desc);
              myRef.setValue("imges",image);

          }
      });

    }
}