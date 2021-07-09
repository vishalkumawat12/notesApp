package com.example.enggnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String [] sub={"1st year","2nd year","3rd year","4th year"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list);
      ArrayAdapter  arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,sub);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(MainActivity.this,year1.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent=new Intent(MainActivity.this,year2.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent=new Intent(MainActivity.this,year3.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent=new Intent(MainActivity.this,year4.class);
                    startActivity(intent);
                }


            }
        });

    }
}