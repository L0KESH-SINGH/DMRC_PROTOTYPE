package com.example.dmrc_prototype;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;

public class open_picture extends AppCompatActivity {

    int num ;
    int [] pictures = {
            R.drawable.a ,
            R.drawable.b ,
            R.drawable.c ,
            R.drawable.e ,
            R.drawable.f ,
            R.drawable.g ,
    };

    ImageView pic  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_picture);

        Intent intent = getIntent() ;
        num = intent.getIntExtra("index",0);

        pic = (ImageView)findViewById(R.id.uuu);
        pic.setImageResource(pictures[num]);

    }
}
