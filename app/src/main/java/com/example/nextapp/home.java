package com.example.nextapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class home extends AppCompatActivity {
    ImageView ivFirst , ivSecond , ivThird , ivFourth ,ivFifth , ivSixth;
    TextView descFirst , descSecond , descThird , descFourth , descFifth , descSixth;
    EditText etSearch;
    BottomNavigationView BottomAppBar;
    CardView cvFirst , cvSecond ,cvThird , cvFourth , cvFifth , cvSixth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ivFirst = findViewById(R.id.ivFirst);
        ivSecond = findViewById(R.id.ivSecond);
        ivThird = findViewById(R.id.ivThird);
        ivFourth =findViewById(R.id.ivFourth);
        ivFifth = findViewById(R.id.ivFifth);
        ivSixth = findViewById(R.id.ivSixth);

        etSearch = findViewById(R.id.etSearch);
        BottomAppBar = findViewById(R.id.bottomAppBar);

        descFirst = findViewById(R.id.descFirst);
        descSecond = findViewById(R.id.descSecond);
        descThird = findViewById(R.id.descThird);
        descFourth = findViewById(R.id.descFourth);
        descFifth = findViewById(R.id.descFifth);
        descSixth = findViewById(R.id.descSixth);

        cvFirst = findViewById(R.id.cvFirst);
        cvSecond = findViewById(R.id.cvSecond);
        cvThird = findViewById(R.id.cvThird);
        cvFourth = findViewById(R.id.cvFourth);
        cvFifth = findViewById(R.id.cvFifth);
        cvSixth = findViewById(R.id.cvSixth);

        BottomAppBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        cvFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (com.example.nextapp.home.this,com.example.nextapp.description.class);
                intent.putExtra("desc",descFirst.getText().toString());
                intent.putExtra("image","First");

                startActivity(intent);

            }
        });

        cvSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (com.example.nextapp.home.this,com.example.nextapp.description.class);
                intent.putExtra("desc",descSecond.getText().toString());
                intent.putExtra("image","Second");
                startActivity(intent);


            }
        });

        cvThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (com.example.nextapp.home.this,com.example.nextapp.description.class);
                intent.putExtra("desc",descThird.getText().toString());
                intent.putExtra("image","Third");
                startActivity(intent);


            }
        });
        cvFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent (com.example.nextapp.home.this,com.example.nextapp.description.class);
                intent.putExtra("desc",descFourth.getText().toString());
                intent.putExtra("image","Fourth");
                startActivity(intent);


            }
        });

        cvFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (com.example.nextapp.home.this,com.example.nextapp.description.class);
                intent.putExtra("desc",descFifth.getText().toString());
                intent.putExtra("image","Fifth");
                startActivity(intent);


            }
        });
        cvSixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent (com.example.nextapp.home.this,com.example.nextapp.description.class);
                intent.putExtra("desc",descSixth.getText().toString());
                intent.putExtra("image","Sixth");
                startActivity(intent);


            }
        });

    }
}