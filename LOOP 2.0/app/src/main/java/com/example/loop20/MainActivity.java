package com.example.loop20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private List<Video> videoList;
    private VideoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoList= new ArrayList<>();
        viewPager2= findViewById(R.id.viewPager2);

//        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.a1));
//        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.a21));
//        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.a22));
//        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.a23));

        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.a));
        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.b));
        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.c));
        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.d));
        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.e));
        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.f));
        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.g));

//        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.h));
//        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.i));
//        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.j));
//        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.k));
//        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.l));
//        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.z));
//        videoList.add(new Video("android.resource://"+ getPackageName()+ "/"+ R.raw.z1));

        adapter= new VideoAdapter(videoList);
        viewPager2.setAdapter(adapter);
    }
}
