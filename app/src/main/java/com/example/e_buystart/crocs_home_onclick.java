package com.example.e_buystart;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class crocs_home_onclick extends AppCompatActivity {
    Toolbar toobar_onclickcomponents;//fortoolbar
    ImageView order_shareid,order_addtobagid,order_savetowishlistid;
    FrameLayout framelayout_onlcick;
    LottieAnimationView order_wishlist_anim,order_cart_anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crocs_home_onclick);
        //fortoolbar
        toobar_onclickcomponents=findViewById(R.id.toobar_onclickcomponents);
        order_shareid=findViewById(R.id.order_shareid);
        order_addtobagid=findViewById(R.id.order_addtobagid);
        order_savetowishlistid=findViewById(R.id.order_savetowishlistid);
        order_wishlist_anim=findViewById(R.id.order_wishlist_anim);
        order_cart_anim=findViewById(R.id.order_cart_anim);
        setSupportActionBar(toobar_onclickcomponents);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        order_shareid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(crocs_home_onclick.this, "share", Toast.LENGTH_SHORT).show();
            }
        });
order_addtobagid.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        order_cart_anim.setVisibility(View.VISIBLE);
        order_cart_anim.playAnimation();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                order_cart_anim.setVisibility(View.GONE);
            }
        },3000);
    }
});
order_savetowishlistid.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        order_wishlist_anim.setVisibility(View.VISIBLE);
        order_wishlist_anim.playAnimation();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                order_wishlist_anim.setVisibility(View.GONE);
            }
        },2000);

    }

});
order_shareid.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent share=new Intent(Intent.ACTION_SEND);
        share.setType("text/plain");
        Toast.makeText(crocs_home_onclick.this, "Sharing through", Toast.LENGTH_SHORT).show();
        share.putExtra(Intent.EXTRA_TEXT,"Shop everything you love, effortlessly, with our e-buy app - where convenience meets your cravings. Download Now https://www.temporary-url.com/4ABA90 ");
        startActivity(share);
    }
});
    }
    //fortoolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.items_onlick, menu);
        return true;
    }
    //fortoolbar
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemID = item.getItemId();
        if (itemID == R.id.onclick_wishlist) {
            Toast.makeText(this, "wishlist", Toast.LENGTH_SHORT).show();

        } else if (itemID == R.id.onclick_cart) {
            Toast.makeText(this, "cart", Toast.LENGTH_SHORT).show();

            Intent intent_order =new Intent(crocs_home_onclick.this,cart_for_onclick.class);
            startActivity(intent_order);
        }
        return super.onOptionsItemSelected(item);

    }
    //fortoolbar
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}