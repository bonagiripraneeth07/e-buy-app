package com.example.e_buystart;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;


import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;
import java.util.List;

public class onclickcomponents extends AppCompatActivity {
Toolbar  toobar_onclickcomponents;

Chip cplus,c;
RecyclerView recyclerview;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onclickcomponents);
        toobar_onclickcomponents=findViewById(R.id.toobar_onclickcomponents);
        setSupportActionBar(toobar_onclickcomponents);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.items_onlick, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemID = item.getItemId();
        if (itemID == R.id.onclick_wishlist) {
            Toast.makeText(this, "wishlist", Toast.LENGTH_SHORT).show();



        } else if (itemID == R.id.onclick_cart) {
            Toast.makeText(this, "cart", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);

    }





    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}