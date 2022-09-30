package com.febete.week2_listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ArrayAdaptorActivity extends ListActivity {

    static final String[] ANIMALS = new String[]{"Ant","Bird", "Cat", "Dog","Donkey", "Elephant","Giraffe","Goat","Monkey","Pig","Rag"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_array_adapter);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_array_adaptor, ANIMALS));
        ListView listView = getListView();
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), ((TextView)view).getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}