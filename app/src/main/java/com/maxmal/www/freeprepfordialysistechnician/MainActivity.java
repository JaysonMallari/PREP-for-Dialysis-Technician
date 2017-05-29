package com.maxmal.www.freeprepfordialysistechnician;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.InterstitialAd;

import static com.maxmal.www.freeprepfordialysistechnician.R.layout.activity_main00;

public class MainActivity extends AppCompatActivity {
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main00);

        // start new activity after 5secs.
        new CountDownTimer(5000, 5000){

            public void onTick(long millisUntilFinished){
            }
            public void onFinish(){
                Intent intent  = new Intent(MainActivity.this, MainActivity01.class);
                startActivity(intent);
            }
        }.start();
    }

}
