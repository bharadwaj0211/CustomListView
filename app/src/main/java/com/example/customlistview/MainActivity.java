package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] cities={"Dallas", "Kansas", "Chicago", "Los Angeles"};
    String[] states={"TX", "MO", "IL", "CA"};
    int[] imageId={R.drawable.dallas, R.drawable.kansas, R.drawable.chicago, R.drawable.newyork};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listview);
        MyAdapter myAdapter= new MyAdapter(this, cities,states, imageId);

        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "City selected", Toast.LENGTH_LONG).show();
            }
        });

    }


}
