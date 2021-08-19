package com.example.nextapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

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

            }
        });

        cvSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cvThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        cvFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cvFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        cvSixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}