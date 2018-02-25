package com.example.android.hylda_1202154346_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    private static int SPLASH = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() { //Handler Splash Screen
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, Login.class); //splash
                startActivity(intent); //start splash screen
                finish(); //close splash activity
            }
        }, SPLASH); //waktu splash screen



    }
}
