package com.example.nextapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class description extends AppCompatActivity {
    ImageView iv_;
    TextView tv_desc , tv_long_desc;
    Button btn_toCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        iv_ = findViewById(R.id.iv_);
        tv_desc = findViewById(R.id.tv_desc);
        tv_long_desc = findViewById(R.id.tv_long_desc);
        btn_toCart = findViewById(R.id.btn_toCart);

        String desc = getIntent().getStringExtra("desc");
        String image = getIntent().getStringExtra("image");

        tv_desc.setText(desc);

        if (image.equals("First")){
            iv_.setImageResource(R.drawable.h1);
            tv_long_desc.setText("first");
        }
        else if(image.equals("Second")){
            iv_.setImageResource(R.drawable.h2);
            tv_long_desc.setText("Second");
        }
        else if(image.equals("Third")){
            iv_.setImageResource(R.drawable.h3);
            tv_long_desc.setText("Third");}
        else if(image.equals("Fourth")){
            iv_.setImageResource(R.drawable.h4);
            tv_long_desc.setText("Fourth");}
        else if(image.equals("Fifth")){
            iv_.setImageResource(R.drawable.h5);
            tv_long_desc.setText("Fifth");}
        else if(image.equals("Sixth")){
            iv_.setImageResource(R.drawable.h6);
            tv_long_desc.setText("Sixth");}



    }
}