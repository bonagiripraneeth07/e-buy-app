package com.example.e_buystart;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class Mainpage extends AppCompatActivity {
    Toolbar toolbar;
    ImageView title_logo;
    EditText searchbar;
    NavigationView navbar;
    DrawerLayout draw;
    BottomNavigationView btmnavigation;
    VideoView videoview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btmnavigation=findViewById(R.id.btmnavigation);
        title_logo = findViewById(R.id.tool_logo);
        searchbar = findViewById(R.id.searchbar);
        navbar = findViewById(R.id.navbar);
        draw = findViewById(R.id.draw);
        Intent next;


        btmnavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id =item.getItemId();

                if (id==R.id.item_nav_home){
                    loadfragment(new homepagefragment(),1);

                } else if (id==R.id.item_nav_categories) {
                    loadfragment(new categoriesfragment(),0);
                } else if (id==R.id.item_nav_explore) {
                    loadfragment(new fragment_explorepage(),0);
                }else {
                    loadfragment(new fragment_cartpage(),0);
                }
                return true;

            }

        });
        btmnavigation.setSelectedItemId(R.id.item_nav_home);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, draw, toolbar, R.string.open_drawer, R.string.close_drawer);
        draw.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        navbar.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent in;
                int itemid_draw = item.getItemId();
                if (itemid_draw == R.id.account_items_drawer) {

                     in = new Intent(Mainpage.this, drawer_settings.class);
                    startActivity(in);
                } else if (itemid_draw==R.id.settings_items_drawer) {
                    in = new Intent(Mainpage.this, drawer_account.class);

                    startActivity(in);
                }else {
                    in=new Intent(Mainpage.this, drawer_about.class);
                    startActivity(in);
                }
                draw.closeDrawer(GravityCompat.START);
                return true;

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.items_toolbar, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemID = item.getItemId();
        if (itemID == R.id.search_item) {
            Toast.makeText(this, "searcrh", Toast.LENGTH_SHORT).show();
            searchbar.setVisibility(View.VISIBLE);
            title_logo.setVisibility(View.GONE);
        } else if (itemID == R.id.wishlist_item) {
            Toast.makeText(this, "wishlist", Toast.LENGTH_SHORT).show();
            Intent intentview=new Intent(Mainpage.this, wishlist_for_onclick.class);
            startActivity(intentview);
        }
        return super.onOptionsItemSelected(item);

    }


    public void loadfragment(Fragment fragment ,int flag){
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (flag==1)
            ft.add(R.id.frames,fragment);
        else
            ft.replace(R.id.frames,fragment);
        ft.commit();
    }

    @Override
    public void onBackPressed() {
            super.onBackPressed();
        finishAffinity();
    }


}