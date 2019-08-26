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

public class PublicationActivity extends AppCompatActivity {
    ImageView indexIV;

    String[] listviewSlno = new String[]{
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
    };

    String[] title = new String[]{
            "PIB feature compilation on children and women issue",
            "Disaster affairs journalism",
            "Agriculture Reporting in Bangladesh",
            "PIB Annual Report (2011-2012)",
            "Opposing the liberation war in newspaper: Portraying repression, conspiracy and statements of killers",
            "Bangabandhu and mass media",
            "Mass Communication theories and applications",
            "Journalism at grassroots level",
            "Trends and classifications of yellow journalism in Bangladesh",
            "Media and communalism",
            "News Arena (reprint)",
            "Air pollution : handbook for mass media",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publication);

        indexIV = (ImageView) findViewById(R.id.indexIV);
        indexIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PublicationActivity.this,IndexActivity.class);
                startActivity(i);
            }
        });

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 12; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("slno", listviewSlno[i]);
            hm.put("title", title[i]);
            aList.add(hm);
        }

        String[] from = {"slno", "title"};
        int[] to = {R.id.slTV, R.id.titleTV};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.custom_publication_listview, from, to);
        ListView androidListView = (ListView) findViewById(R.id.listView);
        androidListView.setAdapter(simpleAdapter);
    }
}
