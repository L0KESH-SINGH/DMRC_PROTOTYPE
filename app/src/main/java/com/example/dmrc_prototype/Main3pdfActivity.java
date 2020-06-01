package com.example.dmrc_prototype;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class Main3pdfActivity extends AppCompatActivity {

    ImageButton d1, d2 , d3 ;
    Button button ;
    FirebaseStorage mfirebasestorage ;
    StorageReference mStorageRef;
    int num ;
    StorageReference ref ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3pdf);

        Intent intent = getIntent() ;
        num = intent.getIntExtra("index",0);

        mStorageRef = FirebaseStorage.getInstance().getReference();
        button = (Button)findViewById(R.id.signout5);

        d1 = (ImageButton)findViewById(R.id.down1);
        d2 = (ImageButton)findViewById(R.id.abc);
        d3 = (ImageButton)findViewById(R.id.down3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3pdfActivity.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        });

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download() ;
            }
        });
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download() ;
            }
        });
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download() ;
            }
        });

    }

    public void download()
    {
        mStorageRef = mfirebasestorage.getInstance().getReference();
        if(num==0)
        {
            ref = mStorageRef.child("solution1.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    String url = uri.toString();
                    downloadfiles(Main3pdfActivity.this ,"solution1",".pdf", Environment.DIRECTORY_DOWNLOADS,url);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
        }
        else if(num==1)
        {
            ref = mStorageRef.child("solution2.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    String url = uri.toString();
                    downloadfiles(Main3pdfActivity.this ,"solution2",".pdf", Environment.DIRECTORY_DOWNLOADS,url);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
        }
    }

    public void downloadfiles(Context context , String filename , String fileextension , String destinationdirectory , String url)
    {
        DownloadManager downloadManager = (DownloadManager) context.getSystemService(context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(url) ;
        DownloadManager.Request request = new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context,destinationdirectory,filename+fileextension);
        downloadManager.enqueue(request);
    }

}
