package com.yvesn314.mycartevisite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class AccueilActivity2 extends AppCompatActivity {
    private final int SPLASH_SCREEN_TIMEOUT = 4000;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil2);

        progressBar = findViewById(R.id.progressBar);
        int color = 0xFF00FF00;
        progressBar.getIndeterminateDrawable().setColorFilter(color, PorterDuff.Mode.SRC_IN);
//        progressBar.getProgressDrawable().setColorFilter(color, PorterDuff.Mode.SRC_IN);

        Runnable run =  new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(AccueilActivity2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        new Handler().postDelayed(run, SPLASH_SCREEN_TIMEOUT);
    }

}