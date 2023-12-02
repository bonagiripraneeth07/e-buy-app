package com.example.e_buystart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class toolbarlayout extends AppCompatActivity {
    Toolbar toolbar;
    ImageView searchimg;
    EditText searchbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbarlayout);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        searchbar = findViewById(R.id.searchbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

}