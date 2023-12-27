package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {
    final List<Animals> animalList = new ArrayList<Animals>();
    private ListView listview; // ListView nesnesini tanımladık
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter2);

        animalList.add(new Animals("Cat" , R.mipmap.cat));
        animalList.add(new Animals("Dog",R.mipmap.dog));
        animalList.add(new Animals("Bird",R.mipmap.bird));
        animalList.add(new Animals("Bear",R.mipmap.bear));


        listview = findViewById(R.id.listview);
        AnimalAdapter adapter = new AnimalAdapter(this, animalList);
        listview.setAdapter(adapter);

    }

}