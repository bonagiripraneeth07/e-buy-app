package com.example.e_buystart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class loginpage extends AppCompatActivity {
ImageView skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        skip=findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences pref =getSharedPreferences("name",MODE_PRIVATE);
                SharedPreferences.Editor editor= pref.edit();
                 editor.putBoolean("flag",true);
                 editor.apply();
                Intent next;
                String CHANNEL_ID ="channelid";
                int notiid=1;
                NotificationManager nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                next=new Intent(loginpage.this, Mainpage.class);
                startActivity(next);
                Drawable drawable= ResourcesCompat.getDrawable(getResources(),R.drawable.welcome_notification,null);
                BitmapDrawable bitmapDrawable=(BitmapDrawable) drawable;
                Bitmap img= bitmapDrawable.getBitmap();
             new Handler().postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                         Notification notification = new Notification.Builder(loginpage.this, CHANNEL_ID)

                                 .setStyle(new Notification.BigPictureStyle()
                                         .bigPicture(img))
                                 .setSmallIcon(R.drawable.c_png)
                                 .setContentText("Welcome User" + "😊")
                                 .build();
                         nm.createNotificationChannel(new NotificationChannel(CHANNEL_ID, "chname", NotificationManager.IMPORTANCE_HIGH));
                         nm.notify(notiid, notification);
                     }
                 }
             },5000);

                String CHANNEL_ID2 ="channelid";
                int notiid2=1;
                NotificationManager nm2=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                // next=new Intent(getApplicationContext(), Mainpage.class);
                //startActivity(next);
                Drawable drawable2= ResourcesCompat.getDrawable(getResources(),R.drawable.notification3,null);
                BitmapDrawable bitmapDrawable2=(BitmapDrawable) drawable2;
                Bitmap img2= bitmapDrawable2.getBitmap();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            Notification notification2 = new Notification.Builder(getApplicationContext(), CHANNEL_ID2)


                                    .setStyle(new Notification.BigPictureStyle()
                                            .bigPicture(img2))
                                    .setSmallIcon(R.drawable.c_png)
                                    .setContentText("Just for you" + "🤫" +" 🤗 ")
                                    .build();

                            nm2.createNotificationChannel(new NotificationChannel(CHANNEL_ID2, "chname", NotificationManager.IMPORTANCE_HIGH));
                            nm2.notify(notiid2, notification2);
                        }
                    }
                },60000);

            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(this, "loginFailed", Toast.LENGTH_SHORT).show();
        finishAffinity();
    }

}