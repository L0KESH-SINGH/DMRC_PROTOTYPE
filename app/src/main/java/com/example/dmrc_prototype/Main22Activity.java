package com.example.dmrc_prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main22Activity extends AppCompatActivity {

   // GoogleSignInClient mGoogleSignInClient;
    Button sign_out;
    Button b1 ;
    Button b2 ;
    Button b3 ;
    Button b4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);


        sign_out = findViewById(R.id.signout2);
        b1 = findViewById(R.id.department1);
        b2 = findViewById(R.id.department2);
        b3 = findViewById(R.id.department3);
        b4 = findViewById(R.id.department4);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main22Activity.this, Main33Activity.class);
                //finish();
                startActivity(intent);

            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main22Activity.this, Main33Activity.class);
                //finish();
                startActivity(intent);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main22Activity.this, Main3pdfActivity.class);
                //finish();
                intent.putExtra("index",0);
                startActivity(intent);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main22Activity.this, Main3pdfActivity.class);
                //finish();
                intent.putExtra("index",1);
                startActivity(intent);

            }
        });

        sign_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main22Activity.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        });

    }

}
