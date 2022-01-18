package com.ariyan.namajerniyotniyom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class SecondActivity extends AppCompatActivity {

    TextView textView1, textView2, textView3, textView4, textView5, textView6;
    ImageView imgArrow14;
    AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        imgArrow14 = findViewById(R.id.imgArrow14);
        mAdView = findViewById(R.id.adView);

        // initi
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;
            }
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }
        });

        imgArrow14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code here
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(SecondActivity.this);
                } else {
                    Log.d("TAG", "The interstitial ad wasn't ready yet.");
                }
                Intent myIntent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code here
                Intent myIntent = new Intent(SecondActivity.this, NafolNamaj.class);
                startActivity(myIntent);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code here
                Intent myIntent = new Intent(SecondActivity.this, FiveKalema.class);
                startActivity(myIntent);
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code here
                Intent myIntent = new Intent(SecondActivity.this, JanazaNamaj.class);
                startActivity(myIntent);
            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code here
                Intent myIntent = new Intent(SecondActivity.this, Taimo.class);
                startActivity(myIntent);
            }
        });

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code here
                Intent myIntent = new Intent(SecondActivity.this, KajaNamaj.class);
                startActivity(myIntent);
            }
        });

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code here
                Intent myIntent = new Intent(SecondActivity.this, FarojNamaj.class);
                startActivity(myIntent);
            }
        });
    }
}