package com.maxmal.www.freeprepfordialysistechnician;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class LearnActivity extends AppCompatActivity {
    //Here created a string array for store one or more titles
    private int[] tabsTitles =
            {R.string.category_acronyms,
            R.string.category_conversions,
            R.string.category_organiztions,
            R.string.category_vocabulary};

    private  int[] tabsIcons =
            {
                    R.drawable.acronyms,
                    R.drawable.conversion,
                    R.drawable.organization,
                    R.drawable.vocabulary
            };

    private TabLayout tabLayout;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        //ADs
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
        mInterstitialAd.setAdUnitId(getString(R.string.ad_id_interstitial_learn));
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
        AdView banner = (AdView) findViewById(R.id.banner_adview_learn);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();

        banner.loadAd(adRequest);
    }

    public void nextActivity(){
        // find the view pager that will allow user to swipe between fragments.
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

        // Create an adapter which knows which page should be shown on each page
        CategoryAdapter categoryAdapter = new CategoryAdapter(this,getSupportFragmentManager());

        //setup the the viewpager with the customize adapter
        viewPager.setAdapter(categoryAdapter);

        // find the tablout to w/c will diaply the tab label for each fragment
        tabLayout = (TabLayout) findViewById(R.id.tab);


        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);

        // Display the Icons on the Tab layout
        for ( int x = 0; x<tabsIcons.length; x++){
            tabLayout.getTabAt(x).setIcon(tabsIcons[x]);
        }

        //on first open of app, the icons will be set to alpha of 50% for all other icons besides the current selected icon
        for ( int x = 1; x<tabsIcons.length; x++){
            tabLayout.getTabAt(x).getIcon().setAlpha(128);
        }

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                setTitle(tabsTitles[position]);

                switch (position) {
                    case 0:
                        tabLayout.getTabAt(0).getIcon().setAlpha(255);
                        tabLayout.getTabAt(1).getIcon().setAlpha(128);
                        tabLayout.getTabAt(2).getIcon().setAlpha(128);
                        tabLayout.getTabAt(3).getIcon().setAlpha(128);
                        break;
                    case 1:
                        tabLayout.getTabAt(0).getIcon().setAlpha(128);
                        tabLayout.getTabAt(1).getIcon().setAlpha(255);
                        tabLayout.getTabAt(2).getIcon().setAlpha(128);
                        tabLayout.getTabAt(3).getIcon().setAlpha(128);
                        break;
                    case 2:
                        tabLayout.getTabAt(0).getIcon().setAlpha(128);
                        tabLayout.getTabAt(1).getIcon().setAlpha(128);
                        tabLayout.getTabAt(2).getIcon().setAlpha(255);
                        tabLayout.getTabAt(3).getIcon().setAlpha(128);
                        break;
                    case 3:
                        tabLayout.getTabAt(0).getIcon().setAlpha(128);
                        tabLayout.getTabAt(1).getIcon().setAlpha(128);
                        tabLayout.getTabAt(2).getIcon().setAlpha(128);
                        tabLayout.getTabAt(3).getIcon().setAlpha(255);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
