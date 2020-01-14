package com.mopro.uas.Login_Kit;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;


import com.mopro.uas.test.R;

public class MainActivity extends AppCompatActivity {

private Button button, button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
        setContentView(R.layout.activity_main);

//        final MediaPlayer salaamMP = MediaPlayer.create(this, R.raw.salaam);
//        salaamMP.start();
//        final MediaPlayer bismillahmMP = MediaPlayer.create(this, R.raw.bismillah);

        final Animation nextPagePop = AnimationUtils.loadAnimation(this, R.anim.nextpage_pop);

        button  = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                bismillahmMP.start();
                view.startAnimation(nextPagePop);

                view.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        openAlphabetPage();

                    }
                }, 50);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                bismillahmMP.start();
                view.startAnimation(nextPagePop);

                view.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        openSambungPage();

                    }
                }, 50);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                bismillahmMP.start();
                view.startAnimation(nextPagePop);

                view.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        openLarangPage();

                    }
                }, 50);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                bismillahmMP.start();
                view.startAnimation(nextPagePop);

                view.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        openBerkaitanPage();

                    }
                }, 50);
            }
        });

    }

    public void openAlphabetPage(){
        Intent intent = new Intent(this, AlphabetPage.class);
        startActivity(intent);

    }

    public void openSambungPage(){
        Intent intent = new Intent(this, SambungPage.class);
        startActivity(intent);

    }

    public void openLarangPage(){
        Intent intent = new Intent(this, LarangPage.class);
        startActivity(intent);

    }

    public void openBerkaitanPage(){
        Intent intent = new Intent(this, BerkaitanPage.class);
        startActivity(intent);

    }

}
