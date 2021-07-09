package com.example.enggnotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.enggnotes.fragments.sem1;

public class year1 extends AppCompatActivity {
  AppCompatButton sem1;
  LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year1);
        sem1=findViewById(R.id.butsem1);
        linearLayout=findViewById(R.id.SemReplace1year);
        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.enggnotes.fragments.sem1 sem1=new sem1();
                FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
               ft.replace(R.id.SemReplace1year,sem1);
               ft.commit();

            }
        });

    }
}