package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    TextView tvYear;
    ArrayList<Module> modulesArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);



        lv = (ListView) this.findViewById(R.id.lvModules);

        // Create a few food objects in Food array
        modulesArray = new ArrayList<Module>();
        modulesArray.add(new Module("C208", false));
        modulesArray.add(new Module("C200", true));
        modulesArray.add(new Module("C346", true));

        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new ModuleAdapter(this, R.layout.row, modulesArray);
        lv.setAdapter(aa);





    }



}
