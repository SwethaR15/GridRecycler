package com.example.admin.gridrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    int[] img={R.drawable.guitar,R.drawable.location,R.drawable.rightarrow};
    String[] arr={"Music","location","Direction"};
    ArrayAdapter<String> adapter;
    RecyclerAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        customAdapter=new RecyclerAdapter(this,img,arr);
        recyclerView.setAdapter(customAdapter);
    }
}
