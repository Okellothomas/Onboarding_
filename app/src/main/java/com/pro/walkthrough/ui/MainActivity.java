package com.pro.walkthrough.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.pro.walkthrough.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // this is the splash screen implementation.

        // we go ahead and use the handler class
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // we declare the intent of moving from the current activity to the next activity.
                Intent intent = new Intent(getApplicationContext(), Onboarding.class);

                // we call the startActivity method and pass to it out intent.
                startActivity(intent);

                // we call the finish method to destroy or kill the activity.
                finish();
            }
        }, 2000);
    }
}