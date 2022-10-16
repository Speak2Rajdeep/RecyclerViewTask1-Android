package com.example.recyclerviewtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = (RecyclerView) findViewById(R.id.rclview);

        //Setting a Layout manager as Linear layout
        rcv.setLayoutManager(new LinearLayoutManager(this));

        //Putting data into array
        String arr[] = new String[100];

        for(int i =0;i<arr.length;i++) {

            arr[i] = "Demo Text " + (i+1) ;
        }

        //Sending the data to Adapter Class

        rcv.setAdapter(new MyAdapter(arr,getApplicationContext()));
    }
}