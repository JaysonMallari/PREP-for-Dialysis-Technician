package com.maxmal.www.freeprepfordialysistechnician;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //enable upbutton
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        //initialize mobile aps
        String appID  =  getApplicationContext().getString(R.string.app_id_banner);
         MobileAds.initialize(getApplicationContext(), appID);

        //Banner
        banner();

        //interstitial
        interstitial();

    }

    public void interstitial( ){
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.ad_id_interstitial));
        requestNewInterstitial();

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                showInterstitial();
            }
        });
    }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();

        mInterstitialAd.loadAd(adRequest);
    }


    private void showInterstitial() {
        // Show the ad if it's ready. Otherwise toast and restart the game.
     if(mInterstitialAd.isLoaded()){
         mInterstitialAd.show();
     }

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                //start next activity
                nextActivity();
            }
        });
    }


    public void banner(){
        AdView banner = (AdView) findViewById(R.id.banner_adview);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();

        banner.loadAd(adRequest);
    }

    public void nextActivity(){
        // find and cast the button no ads
        Button noAds = (Button) findViewById(R.id.no_ads);

        //set on click listener for no ads
        noAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://play.google.com/store/apps/details?id=com.maxmal.www.prepfordialysistechnician&rdid=com.maxmal.www.prepfordialysistechnician";

                Intent intentNoAds = new Intent(Intent.ACTION_VIEW);
                intentNoAds.setData(Uri.parse(url));

                startActivity(intentNoAds);
            }
        });

        // find the button with the id "learn"
        Button learnButton =(Button) findViewById(R.id.learn);

        // set onclick listener on the learn button
        learnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            // Start learn activity onclick
            public void onClick(View v) {
                Intent learnIntent = new Intent(MainActivity.this,LearnActivity.class);
                //Interstitial
                startActivity(learnIntent);
            }
        });

        // find the button with the id test
        Button testButton = (Button) findViewById(R.id.test);

        // set the onclick listener for test button
        testButton.setOnClickListener(new View.OnClickListener() {
            // start the test activity onclick
            @Override
            public void onClick(View v) {
                Intent testIntent = new Intent(MainActivity.this,TestActivity.class);
                //Interstitial
                startActivity(testIntent);
            }
        });

        // find the button with the id pct
        Button pctButton = (Button) findViewById(R.id.pct);

        //set onclick listener for the button pct
        pctButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // start pct activity onclick
                Intent pctIntent = new Intent(MainActivity.this,PctActivity.class);
                //Interstitial
                startActivity(pctIntent);
            }
        });
    }
}
