package com.example.giftadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.giftadmin.faculty.UpdateFaculty;
import com.example.giftadmin.notice.DeleteNotice;
import com.example.giftadmin.notice.UploadNotice;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CardView cvAddNotice, cvGalleryImage, cvAddEbook, cvFaculty,cvDeleteNotice;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvAddNotice = findViewById(R.id.cvAddNotice);
        cvGalleryImage = findViewById(R.id.cvGalleryImage);
        cvAddEbook = findViewById(R.id.cvAddEbook);
        cvFaculty = findViewById(R.id.cvFaculty);
        cvDeleteNotice = findViewById(R.id.cvDeleteNotice);

        cvAddNotice.setOnClickListener(this);
        cvGalleryImage.setOnClickListener(this);
        cvAddEbook.setOnClickListener(this);
        cvFaculty.setOnClickListener(this);
        cvDeleteNotice.setOnClickListener(this);
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
        }else if (view.getId() == R.id.cvFaculty) {
            Intent intent = new Intent(MainActivity.this, UpdateFaculty.class);
            startActivity(intent);
        }else if (view.getId() == R.id.cvDeleteNotice) {
            Intent intent = new Intent(MainActivity.this, DeleteNotice.class);
            startActivity(intent);
        }
    }
}