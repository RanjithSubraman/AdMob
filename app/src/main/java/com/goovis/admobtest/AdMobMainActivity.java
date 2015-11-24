package com.goovis.admobtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AdMobMainActivity extends AppCompatActivity {
    Button bannerAd;
    Button interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_mob_main);

        bannerAd = (Button)findViewById(R.id.bannerAd);
        bannerAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AdMobMainActivity.this, BannerActivity.class);
                AdMobMainActivity.this.startActivity(i);

            }
        });

        interstitialAd = (Button)findViewById(R.id.interstitialAd);
        interstitialAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AdMobMainActivity.this, InterstitialActivity.class);
                AdMobMainActivity.this.startActivity(i);
            }
        });
    }

}
