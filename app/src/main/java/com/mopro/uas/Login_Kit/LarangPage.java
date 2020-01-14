package com.mopro.uas.Login_Kit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.mopro.uas.test.R;

import java.util.Arrays;
import java.util.Collections;


public class LarangPage extends AppCompatActivity {

    private ImageView mImageView;
    private TextView mTextView;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.larang_page);

        getSupportActionBar().setTitle("Activity Larang");
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

        /*Button btn = (Button) findViewById(R.id.button2);

        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(LarangPage.this);

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

    Descs d01 = new Descs(R.drawable.aaa,"aaaaaaa");
    Descs d02 = new Descs(R.drawable.bbb,"");
    Descs d03 = new Descs(R.drawable.ccc,"");
    Descs d04 = new Descs(R.drawable.ddd,"");
    Descs d05 = new Descs(R.drawable.eee,"");
    Descs d06 = new Descs(R.drawable.fff,"");

    Descs[] descArray = new Descs[]{
            d01, d02, d03, d04, d05, d06
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



