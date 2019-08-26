package com.example.hypertagsolutionltd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class LearningActivity extends AppCompatActivity {

    ImageButton indexIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);

        indexIV = (ImageButton) findViewById(R.id.indexIV);
        indexIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LearningActivity.this,IndexActivity.class);
                startActivity(i);
            }
        });
    }
}
