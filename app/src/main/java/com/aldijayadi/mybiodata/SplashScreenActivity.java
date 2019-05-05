package com.aldijayadi.mybiodata;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aldijayadi.mybiodata.Fragments.SplashScreen1Fragment;
import com.aldijayadi.mybiodata.Fragments.SplashScreen2Fragment;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportFragmentManager().beginTransaction().replace(R.id.itscontainer, new SplashScreen1Fragment()).commit();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                getSupportFragmentManager().beginTransaction().replace(R.id.itscontainer, new SplashScreen2Fragment()).commit();
            }
        },3000L);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },6000L);
    }
}
