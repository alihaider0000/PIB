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

public class AboutActivity extends AppCompatActivity {

    ImageView indexIV;

    String[] title = new String[]{
            "Press Institute Bangladesh (PIB)",
            "Director General",
            "Director (Admin)",
            "Director (Studies & Training)",
            "Director (Research)",
            "Associate Editor",
    };
    String[] info = new String[]{
            "3 Circuit House Road, Dhaka-1000 "+"\n"+"PABX : 9330081-3"+"\n"+"Fax : 880-2-8317458"+"\n"+"E-mail : dg@pib.gov.bd, info@pib.gov.bd"+"\n"+"Website : www.pib.gov.bd",
            "Phone : 9341906, 58356020"+"\n"+"Mobile : 01711594670"+"\n"+"Fax : 880-2-8317458"+"\n"+"E-mail : dg@pib.gov.bd | dgpib@yahoo.com",
            "Phone : 8351224"+"\n"+"Fax : 880-2-8317458"+"\n"+"E-mail : da@pib.gov.bd",
            "Phone : 9362687"+"\n"+"Fax : 880-2-8317458"+"\n"+"E-mail : dt@pib.gov.bd",
            "Phone : 9361424"+"\n"+"Fax : 880-2-8317458"+"\n"+"E-mail : dr@pib.gov.bd",
            "Phone : 9333403"+"\n"+"Fax : 880-2-8317458"+"\n"+"E-mail : ae@pib.gov.bd",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        indexIV = (ImageView) findViewById(R.id.indexIV);
        indexIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AboutActivity.this,IndexActivity.class);
                startActivity(i);
            }
        });

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 6; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("title", title[i]);
            hm.put("info", info[i]);
            aList.add(hm);
        }

        String[] from = {"title", "info"};
        int[] to = {R.id.aboutTV, R.id.about_infoTV};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.custome_about_listview, from, to);
        ListView androidListView = (ListView) findViewById(R.id.listView);
        androidListView.setAdapter(simpleAdapter);
    }
}
