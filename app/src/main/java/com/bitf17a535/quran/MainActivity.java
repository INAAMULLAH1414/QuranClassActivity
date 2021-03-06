package com.bitf17a535.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String []data = getResources().getStringArray(R.array.translation);
        String []data1 = getResources().getStringArray(R.array.translation);

        listView = findViewById(R.id.simpleListView);
        arrayList = new ArrayList<String>();
        for(int i=0;i<data1.length;i++){
            arrayList.add(data[i]);
            arrayList.add(data[i]);
        }


        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

    }
}