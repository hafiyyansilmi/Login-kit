package com.mopro.uas.Login_Kit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mopro.uas.test.R;

public class SecondActivity extends AppCompatActivity {

   //private ImageView mImageView;
    //private TextView mTextView;
    //private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sambung_page);

        //mImageView = (ImageView) findViewById(R.id.imageView);
        //mTextView = (TextView) findViewById(R.id.desc);
        //mButton = (Button) findViewById(R.id.desc_button);

        //showRandomDesc();

        /*mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                showRandomDesc();
            }
        });
*/
    }


//    public void onClick(View view) {
//        mTextView text = (TextView) findViewById(R.id.desc);
//        text.setText("Butoonn clicked");
//    }

//    public void showRandomDesc(android.view.View) {
//
//    }

/*
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

    public void showRandomDesc(View view) {
        shuffleDescs();
        mImageView.setImageResource(descArray[0].getmImage());
        mTextView.setText(descArray[0].getmDesc());
    }

    private void shuffleDescs() {
        Collections.shuffle(Arrays.asList(descArray));
    }
*/
//    public void shuffleDescs(){
//        Collections.shuffle(Arrays.asList(descArray));
//    }
}

