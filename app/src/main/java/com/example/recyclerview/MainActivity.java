package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> examplelist = new ArrayList<>();

        examplelist.add(new ExampleItem(R.drawable.ic_android,"Line 1", "Line 2"));
        examplelist.add(new ExampleItem(R.drawable.ic_baseline,"Line 3", "Line 4"));
        examplelist.add(new ExampleItem(R.drawable.ic_archive,"Line 5", "Line 6"));

        examplelist.add(new ExampleItem(R.drawable.ic_android,"Line 7", "Line 8"));
        examplelist.add(new ExampleItem(R.drawable.ic_baseline,"Line 9", "Line 10"));
        examplelist.add(new ExampleItem(R.drawable.ic_archive,"Line 11", "Line 12"));

        examplelist.add(new ExampleItem(R.drawable.ic_android,"Line 13", "Line 14"));
        examplelist.add(new ExampleItem(R.drawable.ic_baseline,"Line 15", "Line 16"));
        examplelist.add(new ExampleItem(R.drawable.ic_archive,"Line 17", "Line 18"));

        examplelist.add(new ExampleItem(R.drawable.ic_android,"Line 19", "Line 20"));
        examplelist.add(new ExampleItem(R.drawable.ic_baseline,"Line 21", "Line 22"));
        examplelist.add(new ExampleItem(R.drawable.ic_archive,"Line 23", "Line 24"));

        examplelist.add(new ExampleItem(R.drawable.ic_android,"Line 25", "Line 26"));
        examplelist.add(new ExampleItem(R.drawable.ic_baseline,"Line 27", "Line 28"));
        examplelist.add(new ExampleItem(R.drawable.ic_archive,"Line 29", "Line 30"));

        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(examplelist);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


    }
}