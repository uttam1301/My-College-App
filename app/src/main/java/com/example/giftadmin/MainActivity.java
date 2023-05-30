package com.example.giftadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CardView cvAddNotice;
    CardView cvGalleryImage;
    CardView cvAddEbook;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvAddNotice = findViewById(R.id.cvAddNotice);
        cvGalleryImage = findViewById(R.id.cvGalleryImage);
        cvAddEbook = findViewById(R.id.cvAddEbook);

        cvAddNotice.setOnClickListener(this);
        cvGalleryImage.setOnClickListener(this);
        cvAddEbook.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.cvAddNotice) {
            Intent intent = new Intent(MainActivity.this, UploadNotice.class);
            startActivity(intent);
        }else if (view.getId() == R.id.cvGalleryImage) {
            Intent intent = new Intent(MainActivity.this, UploadImage.class);
            startActivity(intent);
        }else if (view.getId() == R.id.cvAddEbook) {
            Intent intent = new Intent(MainActivity.this, UploadEbook.class);
            startActivity(intent);
        }
    }
}