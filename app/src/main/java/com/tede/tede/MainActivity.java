package com.tede.tede;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import  android.widget.ImageButton;

import android.os.Bundle;

//import com.tede.tede.institute.InstituteActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ImageButton teachersButton = findViewById(R.id.imageButton);
//        teachersButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, InstituteActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}