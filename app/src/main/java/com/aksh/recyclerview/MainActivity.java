package com.aksh.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.aksh.recyclerview.data.data;
import com.aksh.recyclerview.model.item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

data adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleview);
        List<item> ll=new ArrayList<item>();
        ll.add(new item("Akshada","Developer"));
        ll.add(new item("Kedar","Developer"));
        ll.add(new item("Vishal","Graph"));
        ll.add(new item("Swadha","Accountant"));
        ll.add(new item("preeti","Agriculture"));
        ll.add(new item("Sanket","ITI"));

        adapter=new data(this,ll);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}