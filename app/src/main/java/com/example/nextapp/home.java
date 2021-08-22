package com.example.nextapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class home extends AppCompatActivity {

    RecyclerView rv_bests , rv_popular;
    RecyclerView.LayoutManager manager , manager2;
    RecyclerView.Adapter myAdapter , myAdabter2;
    ArrayList<items> myitems;
   // ArrayList<items2> myitems2;
    DatabaseReference database , database2;

    EditText etSearch;
    BottomNavigationView BottomAppBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        etSearch = findViewById(R.id.etSearch);
        BottomAppBar = findViewById(R.id.bottomAppBar);
       /* rv_popular= findViewById(R.id.rv_popular);
        rv_popular.setHasFixedSize(true);
        manager2 = new LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false);
        rv_popular.setLayoutManager(manager2);
        myAdabter2 = new popular_Adapter(this , myitems2 );
        rv_popular.setAdapter(myAdabter2);
        database2 = FirebaseDatabase.getInstance().getReference("popular");
        database2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                for ( DataSnapshot dataSnapshot : snapshot.getChildren()){
                    items item = dataSnapshot.getValue(items.class);
                    myitems.add(item);}
                myAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {


            }
        });

*/


        rv_bests = findViewById(R.id.rv_bests);
        rv_bests.setHasFixedSize(true);

        manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        rv_bests.setLayoutManager(manager);

        myitems = new ArrayList<items>();
        //myitems.add(new items("First","h1"));
      //  myitems.add(new items("Second", "h2"));
        myAdapter = new bs_Adapter(this, myitems);
        rv_bests.setAdapter(myAdapter);

        database = FirebaseDatabase.getInstance().getReference("bestSelling");

      database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                for ( DataSnapshot dataSnapshot : snapshot.getChildren()){
                    items item = dataSnapshot.getValue(items.class);
                myitems.add(item);}
                myAdapter.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });










        BottomAppBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

    }
}