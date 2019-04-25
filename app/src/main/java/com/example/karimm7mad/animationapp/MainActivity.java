package com.example.karimm7mad.animationapp;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;

    Button startBtn, stopBtn;

    AnimationDrawable mAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.img = findViewById(R.id.imageView);
        this.startBtn = findViewById(R.id.startBtn);
        this.stopBtn = findViewById(R.id.stopBtn);

        // frame
        BitmapDrawable f1 = (BitmapDrawable) getResources().getDrawable(R.drawable.f1, this.getTheme());
        BitmapDrawable f2 = (BitmapDrawable) getResources().getDrawable(R.drawable.f2, this.getTheme());
        BitmapDrawable f3 = (BitmapDrawable) getResources().getDrawable(R.drawable.f3, this.getTheme());
        BitmapDrawable f4 = (BitmapDrawable) getResources().getDrawable(R.drawable.f4, this.getTheme());
        BitmapDrawable f5 = (BitmapDrawable) getResources().getDrawable(R.drawable.f5, this.getTheme());
        BitmapDrawable f6 = (BitmapDrawable) getResources().getDrawable(R.drawable.f6, this.getTheme());
        BitmapDrawable f7 = (BitmapDrawable) getResources().getDrawable(R.drawable.f7, this.getTheme());


        int reasonableDuration = 50;

        mAnimation = new AnimationDrawable();
        mAnimation.addFrame(f1, reasonableDuration);
        mAnimation.addFrame(f2, reasonableDuration);
        mAnimation.addFrame(f3, reasonableDuration);
        mAnimation.addFrame(f4, reasonableDuration);
        mAnimation.addFrame(f5, reasonableDuration);
        mAnimation.addFrame(f6, reasonableDuration);
        mAnimation.addFrame(f7, reasonableDuration);


        img.setBackground(mAnimation);

        this.startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAnimation.start();
            }
        });

        this.stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAnimation.stop();
            }
        });


    }
}
