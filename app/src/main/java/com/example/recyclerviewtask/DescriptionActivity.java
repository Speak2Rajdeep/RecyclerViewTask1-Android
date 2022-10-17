package com.example.recyclerviewtask;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DescriptionActivity extends AppCompatActivity {

    private TextView textview;
    private ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        imageview = (ImageView) findViewById(R.id.imageview);
        textview = (TextView) findViewById(R.id.textview);

        textview.setText(getIntent().getStringExtra("text"));
        imageview.setImageResource(getIntent().getIntExtra("image",0));
    }
}