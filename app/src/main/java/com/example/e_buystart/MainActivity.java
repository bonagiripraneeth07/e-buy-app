package com.example.e_buystart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
 ProgressBar progressbar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_screen);
     progressbar=findViewById(R.id.progressbar);
new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        SharedPreferences pref =getSharedPreferences("name",MODE_PRIVATE);
        Boolean check = pref.getBoolean("flag",false);
        Intent in;
        if (check){
            in=new Intent(MainActivity.this, Mainpage.class);
        }else {
            in=new Intent(MainActivity.this, loginpage.class);
        }

        startActivity(in);
    }
},1000);

    }
}