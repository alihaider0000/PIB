package com.example.hypertagsolutionltd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class IndexActivity extends AppCompatActivity {

    ImageButton learning;
    ImageButton notice;
    ImageButton publication;
    ImageButton gallery;
    ImageButton clip;
    ImageButton about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        learning = (ImageButton) findViewById(R.id.elearningBtn);
        learning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IndexActivity.this,LearningActivity.class);
                startActivity(i);
            }
        });

        notice = (ImageButton) findViewById(R.id.noticeBtn);
        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IndexActivity.this,NoticeActivity.class);
                startActivity(i);
            }
        });

        publication = (ImageButton) findViewById(R.id.publishBtn);
        publication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IndexActivity.this,PublicationActivity.class);
                startActivity(i);
            }
        });

        gallery = (ImageButton) findViewById(R.id.galleryBtn);
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IndexActivity.this,ImageActivity.class);
                startActivity(i);
            }
        });

        clip = (ImageButton) findViewById(R.id.newsclipBtn);
        clip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IndexActivity.this,NewsClipActivity.class);
                startActivity(i);
            }
        });

        about = (ImageButton) findViewById(R.id.aboutBtn);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IndexActivity.this,AboutActivity.class);
                startActivity(i);
            }
        });
    }
}
