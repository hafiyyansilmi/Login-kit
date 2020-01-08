package com.example.sahmed.ArabicAlphabetApp;

import android.content.DialogInterface;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sahmed.test.R;

import java.util.Arrays;
import java.util.Collections;


public class SambungPage extends AppCompatActivity {

    private ImageView mImageView;
    private TextView mTextView;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sambung_page);

        getSupportActionBar().setTitle("Activity Sambung");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mImageView = (ImageView) findViewById(R.id.imageView);
        mTextView = (TextView) findViewById(R.id.desc);
        mButton = (Button) findViewById(R.id.desc_button);

        showRandomDesc();

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showRandomDesc();
            }
        });

//        Button btn = (Button) findViewById(R.id.button1);
//        Button mButton = (Button)findViewById(R.id.desc_button);
        /*
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(SambungPage.this);

        alertBuilder.setPositiveButton("I'm ready!!!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = alertBuilder.create();
        alert.setMessage("Are you ready? \n\nTouch a letter to hear it's pronunciation!");
        alert.show();
        final Animation animPopOut = AnimationUtils.loadAnimation(this, R.anim.letter_pop);
        */
    }

    Descs d01 = new Descs(R.drawable.aa,"aaaaaaa");
    Descs d02 = new Descs(R.drawable.bb,"");
    Descs d03 = new Descs(R.drawable.cc,"");
    Descs d04 = new Descs(R.drawable.dd,"");
    Descs d05 = new Descs(R.drawable.ee,"");
    Descs d06 = new Descs(R.drawable.ff,"");
    Descs d07 = new Descs(R.drawable.gg,"");
    Descs d08 = new Descs(R.drawable.hh,"");
    Descs d09 = new Descs(R.drawable.ii,"");
    Descs d10 = new Descs(R.drawable.jj,"");

    Descs[] descArray = new Descs[]{
            d01, d02, d03, d04, d05, d06, d07, d08, d09, d10
    };

    public void showRandomDesc() {
        shuffleDescs();
        mImageView.setImageResource(descArray[0].getmImage());
        mTextView.setText(descArray[0].getmDesc());
    }

    private void shuffleDescs() {
        Collections.shuffle(Arrays.asList(descArray));
    }
}



