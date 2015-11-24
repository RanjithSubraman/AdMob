package com.goovis.admobtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class InterstitialActivity extends AppCompatActivity {
    private Button loadButton;
    private Button showButton;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstitial);
        loadButton = (Button)findViewById(R.id.loadInterstitial);
        showButton = (Button)findViewById(R.id.showButton);
        showButton.setEnabled(false);


        loadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButton.setEnabled(false);
                showButton.setText("Interstitial Loading");

                interstitialAd = new InterstitialAd(getApplicationContext());
                interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
                interstitialAd.setAdListener(new TostAdListener(getApplicationContext()) {
                    @Override
                    public void onAdLoaded() {
                        super.onAdLoaded();
                        showButton.setText("Show Interstitial");
                        showButton.setEnabled(true);
                    }

                    @Override
                    public void onAdFailedToLoad(int errorCode) {
                        super.onAdFailedToLoad(errorCode);
                        showButton.setText(getErrorReason());
                    }
                });
                AdRequest adRequest = new AdRequest.Builder().build();
                interstitialAd.loadAd(adRequest);

            }
        });

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(interstitialAd.isLoaded()){
                    interstitialAd.show();
                }
                showButton.setText("Interstitial Not Ready");
                showButton.setEnabled(false);

            }
        });
    }
}
