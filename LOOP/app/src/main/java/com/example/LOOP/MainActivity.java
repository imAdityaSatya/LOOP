package com.example.loop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager= findViewById(R.id.viewPager);
        com.example.loop.Adapter adapter= new com.example.loop.Adapter(this);
        viewPager.setAdapter(adapter);


    }
}