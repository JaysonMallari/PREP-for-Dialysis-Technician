package com.maxmal.www.freeprepfordialysistechnician;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConvertionsFragment extends Fragment {

    ArrayList<Word> words  = new ArrayList<Word>(
            Arrays.asList(
                    new Word("L",R.string.length_measures,R.string.length_measures_measurement_meaning,R.color.l),
                    new Word("L",R.string.linear_measures,R.string.linear_measures_measurement_meaning,R.color.l),
                    new Word("L",R.string.liquid_measurement,R.string.liquid_measurement_meaning,R.color.l),

                    new Word("M",R.string.metric_cubic_measures,R.string.metric_liquid_measures_measurement_meaning,R.color.m),
                    new Word("M",R.string.metric_liquid_measures,R.string.metric_liquid_measures_measurement_meaning,R.color.m),
                    new Word("M",R.string.metric_square_measures,R.string.metric_square_measures_measurement_meaning,R.color.m),
                    new Word("L",R.string.metric_weight_measures,R.string.metric_liquid_measures_measurement_meaning,R.color.m),

                    new Word("T",R.string.temp_measures,R.string.temp_measures_measurement_meaning,R.color.t),

                    new Word("W",R.string.weight_measures,R.string.weight_measures_measurement_meaning,R.color.w)

            ));


    InterstitialAd mInterstitialAd;

    public ConvertionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       // ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.category_conversions);
        View rootView = inflater.inflate(R.layout.words_list,container,false);

        //initialize mobile aps
        String appID  =  getActivity().getApplicationContext().getString(R.string.app_id_banner);
        MobileAds.initialize(getActivity().getApplicationContext(), appID);

        // call the setNumberAdapter onCreate method
        setConversionAdapter(rootView);

        return rootView;
    }

    public void setConversionAdapter(View rV){

        // Construct a new word adapter
        WordAdapter adapter  = new WordAdapter(getActivity(), words);

        // cast the listview
        ListView listView = (ListView) rV.findViewById(R.id.list);

        //set the adapter to the listview
        listView.setAdapter(adapter);


        //set the listview items onclick listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);

                // convert the position label and description data to string for transfer
                String label = getResources().getString(word.getmMainWord());
                String description = getResources().getString(word.getmMeaningResourceId());

                //get color from the current position
                int color = ContextCompat.getColor(getContext(),word.getmColorResourceId());

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setMessage(description).setCancelable(false).setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alert = builder.create();
                alert.setTitle(label);
                //interstitial
                interstitial(alert);

                // toast the meaning
                Toast toast = Toast.makeText(getContext(),"You have selected "+ label+ " .",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }

    public void interstitial(final AlertDialog alert ){
        mInterstitialAd = new InterstitialAd(getActivity());
        mInterstitialAd.setAdUnitId(getString(R.string.ad_id_interstitial_learn_popup));
        requestNewInterstitial();

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                showInterstitial(alert);
            }
        });
    }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();

        mInterstitialAd.loadAd(adRequest);
    }


    private void showInterstitial(final AlertDialog alert) {
        // Show the ad if it's ready. Otherwise toast and restart the game.
        if(mInterstitialAd.isLoaded()){
            mInterstitialAd.show();
        }

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                //start next activity
                alert.show();
            }
        });
    }



}
