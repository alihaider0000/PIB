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

public class NoticeActivity extends AppCompatActivity {

    ImageView indexIV;

    String[] listviewTitle = new String[]{
            "Postgraduate Diploma Course in Journalism 2018-19",
            "Objection Letter for Issuance of Passport Issue of PIB Plumber Shawkat Khan",
            "Masters in Media and Journalism (1st Part) Class routine for August of the academic year",
            "Postgraduate Diploma Course in Journalism session 2018-19, Class Routine for July",
            "Call for proposals to produce short films and documentaries",
            "Dial toll free number 109 to receive disaster warning message in advance.",
    };
    int[] listviewImage = new int[]{
            R.drawable.pdf, R.drawable.pdf, R.drawable.pdf, R.drawable.pdf,
            R.drawable.pdf, R.drawable.pdf,
    };

    String[] pubDate = new String[]{
            "20-08-2019",
            "19-08-2019",
            "04-08-2019",
            "04-08-2019",
            "01-08-2019",
            "18-07-2019",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        indexIV = (ImageView) findViewById(R.id.indexIV);
        indexIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NoticeActivity.this,IndexActivity.class);
                startActivity(i);
            }
        });

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 6; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            hm.put("pubDate", pubDate[i]);
            aList.add(hm);
        }

        String[] from = {"listview_image", "listview_title", "pubDate"};
        int[] to = {R.id.imageView, R.id.textView4, R.id.textView5};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.custome_notice_listview, from, to);
        ListView androidListView = (ListView) findViewById(R.id.listView);
        androidListView.setAdapter(simpleAdapter);
    }
}
