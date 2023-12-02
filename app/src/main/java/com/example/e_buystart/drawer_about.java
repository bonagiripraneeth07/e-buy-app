package com.example.e_buystart;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class drawer_about extends AppCompatActivity {
ImageView share_whatsapp,share_instagram,share_telegram,github_mine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_about);
        share_whatsapp=findViewById(R.id.share_whatsapp);
        share_instagram=findViewById(R.id.share_instagram);
        share_telegram=findViewById(R.id.share_telegram);
        github_mine=findViewById(R.id.github_mine);
        share_whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              vibarate();

                Toast.makeText(drawer_about.this, "sharing through whatsapp", Toast.LENGTH_SHORT).show();
                Intent sharethroughwhatsapp =new Intent(Intent.ACTION_SEND);
                sharethroughwhatsapp.setType("text/plain");
                sharethroughwhatsapp.setPackage("com.whatsapp");
                    sharethroughwhatsapp.putExtra(Intent.EXTRA_TEXT, "Shop everything you love, effortlessly, with our e-buy app - where convenience meets your cravings. Download Now https://www.temporary-url.com/4ABA90  "); // Add text to share here
                    startActivity(sharethroughwhatsapp);
            }
        });
        share_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibarate();
                Intent sharethroughinstagram=new Intent(Intent.ACTION_SEND);
                sharethroughinstagram.setType("text/plain");
                Toast.makeText(drawer_about.this, "Sharing through Instagram", Toast.LENGTH_SHORT).show();
                sharethroughinstagram.putExtra(Intent.EXTRA_TEXT,"Shop everything you love, effortlessly, with our e-buy app - where convenience meets your cravings. Download Now https://www.temporary-url.com/4ABA90 ");
                startActivity(sharethroughinstagram);
            }
        });
share_telegram.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        vibarate();
        Intent sharethroughtelegram=new Intent(Intent.ACTION_SEND);
        sharethroughtelegram.setType("text/plain");
        sharethroughtelegram.setPackage("org.telegram.messenger");
        Toast.makeText(drawer_about.this, "Sharing through Telegram", Toast.LENGTH_SHORT).show();
        sharethroughtelegram.putExtra(Intent.EXTRA_TEXT,"Shop everything you love, effortlessly, with our e-buy app - where convenience meets your cravings. Download Now https://www.temporary-url.com/4ABA90 ");
        startActivity(sharethroughtelegram);
    }
});
github_mine.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
vibarate();
        String url = "https://github.com/bonagiripraneeth07";
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.setPackage("com.android.chrome");
        Toast.makeText(drawer_about.this, "Opening Github", Toast.LENGTH_SHORT).show();
        try {
            startActivity(i);
        } catch (ActivityNotFoundException e) {
            // Chrome is probably not installed
            // Try with the default browser
            i.setPackage(null);
            startActivity(i);
        }
    }
});
    }
    public void vibarate() {
        Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (Build.VERSION.SDK_INT >= 26) {
            vibe.vibrate(VibrationEffect.createOneShot(200, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            vibe.vibrate(200);
        }
    }
}