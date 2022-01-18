package com.ariyan.namajerniyotniyom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class NafolNamaj extends AppCompatActivity {

    TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7;
    ImageView imgArrow14;
    AdView mAdView,mAdView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nafol_namaj);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        imgArrow14 = findViewById(R.id.imgArrow14);
        mAdView = findViewById(R.id.adView);
        mAdView2 = findViewById(R.id.adView2);

        // initi
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView2.loadAd(adRequest);

        imgArrow14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code here
                Intent myIntent = new Intent(NafolNamaj.this, SecondActivity.class);
                startActivity(myIntent);
            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code here
                Intent myIntent = new Intent(NafolNamaj.this, NafolNamajerNiot.class);
                startActivity(myIntent);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code here
                Intent myIntent = new Intent(NafolNamaj.this, NafolNamajerShura.class);
                startActivity(myIntent);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code here
                Intent myIntent = new Intent(NafolNamaj.this, TahiatulNamaj.class);
                startActivity(myIntent);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code here
                Intent myIntent = new Intent(NafolNamaj.this, Dukholil.class);
                startActivity(myIntent);
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code here
                Intent myIntent = new Intent(NafolNamaj.this, Manjil.class);
                startActivity(myIntent);
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code here
                Intent myIntent = new Intent(NafolNamaj.this, Shalatul.class);
                startActivity(myIntent);
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code here
                Intent myIntent = new Intent(NafolNamaj.this, Riner.class);
                startActivity(myIntent);
            }
        });
    }
}