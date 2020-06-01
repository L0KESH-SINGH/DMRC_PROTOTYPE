package com.example.dmrc_prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main33Activity extends AppCompatActivity {

    public ImageButton [] m = new ImageButton[6];
    Button signout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main33);

        m[0] = (ImageButton) findViewById(R.id.a);
        m[1] = (ImageButton) findViewById(R.id.b);
        m[2] = (ImageButton) findViewById(R.id.c);
        m[3] = (ImageButton) findViewById(R.id.x);
        m[4] = (ImageButton) findViewById(R.id.y);
        m[5] = (ImageButton) findViewById(R.id.abc);
        //m[3].setImageDrawable(R.drawable.d);

        signout = (Button)findViewById(R.id.signout2);

        m[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main33Activity.this, open_picture.class);
                intent.putExtra("index",0);
                startActivity(intent);
            }
        });
        m[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main33Activity.this, open_picture.class);
                intent.putExtra("index",1);
                startActivity(intent);
            }
        });
        m[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main33Activity.this, open_picture.class);
                intent.putExtra("index",2);
                startActivity(intent);
            }
        });
        m[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main33Activity.this, open_picture.class);
                intent.putExtra("index",3);
                startActivity(intent);
            }
        });
        m[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main33Activity.this, open_picture.class);
                intent.putExtra("index",4);
                startActivity(intent);
            }
        });
        m[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main33Activity.this, open_picture.class);
                intent.putExtra("index",5);
                startActivity(intent);
            }
        });


        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main33Activity.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        });

    }
}
