package com.example.hypertagsolutionltd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ImageActivity extends AppCompatActivity {

    ImageView indexIV;
    String[] listviewTitle = new String[]{
            "Image1", "Image2", "Image3", "Image4",
            "Image5", "Image6", "Image7", "Image8",
    };
    int[] listviewImage = new int[]{
            R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img9,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        indexIV = (ImageView) findViewById(R.id.indexIV);
        indexIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ImageActivity.this,IndexActivity.class);
                startActivity(i);
            }
        });

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 8; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            aList.add(hm);
        }

        String[] from = {"listview_image", "listview_title"};
        int[] to = {R.id.clipIV, R.id.clipTV};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.custom_listview, from, to);
        ListView androidListView = (ListView) findViewById(R.id.listView);
        androidListView.setAdapter(simpleAdapter);
    }
}
