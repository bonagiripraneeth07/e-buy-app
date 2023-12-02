package com.example.e_buystart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

public class explore_onlclick_toolbar extends AppCompatActivity {
    Toolbar toolbar_for_explore;
    ImageView explore_men,womensfashion_explore;
    FrameLayout framelayout_explore;
    @SuppressLint("MissingInflatedId")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_onlclick_toolbar);
framelayout_explore=findViewById(R.id.framelayout_explore);
        toolbar_for_explore=findViewById(R.id.toolbar_for_explore);
        setSupportActionBar(toolbar_for_explore);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        explore_men=findViewById(R.id.explore_men);
        womensfashion_explore=findViewById(R.id.womensfashion_explore);
            FragmentManager fmm = getSupportFragmentManager();
            FragmentTransaction ftt = fmm.beginTransaction();
                    ftt.add(R.id.framelayout_explore, new explore_men_fragment());
                    ftt.commit();
                }








    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}