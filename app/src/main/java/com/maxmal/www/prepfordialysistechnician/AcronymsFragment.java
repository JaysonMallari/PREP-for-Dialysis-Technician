package com.maxmal.www.prepfordialysistechnician;


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

import java.util.ArrayList;
import java.util.Arrays;

import static com.maxmal.www.prepfordialysistechnician.R.color.a;

/**
 * A simple {@link Fragment} subclass.
 */
public class AcronymsFragment extends Fragment {
    ArrayList<Word> words  = new ArrayList<Word>(
            Arrays.asList(
                    new Word("A",R.string.arbd,R.string.arbd_meaning, a),
                    new Word("A",R.string.av,R.string.av_meaning, a),
                    new Word("A",R.string.apd,R.string.apd_meaning, a),
                    new Word("B",R.string.bun,R.string.bun_meaning,R.color.b),
                    new Word("C",R.string.capd,R.string.capd_meaning,R.color.c),
                    new Word("C",R.string.ccpd,R.string.ccpd_meaning,R.color.c),
                    new Word("C",R.string.cfu,R.string.cfu_meaning,R.color.c),
                    new Word("C",R.string.chf,R.string.chf_meaning,R.color.c),
                    new Word("C",R.string.ckd,R.string.ckd_meaning,R.color.c),
                    new Word("C",R.string.cqi,R.string.cqi_meaning,R.color.c),
                    new Word("C",R.string.crrt,R.string.crrt_meaning,R.color.c),
                    new Word("E",R.string.edw,R.string.edw_meaning,R.color.e),
                    new Word("E",R.string.epo,R.string.epo_meaning,R.color.e),
                    new Word("E",R.string.esrd,R.string.esrd_meaning,R.color.e),
                    new Word("E",R.string.eto,R.string.eto_meaning,R.color.e),
                    new Word("F",R.string.fbv,R.string.fbv_meaning,R.color.f),
                    new Word("G",R.string.gfr,R.string.gfr_meaning,R.color.g),
                    new Word("H",R.string.hct,R.string.hct_meaning,R.color.h),
                    new Word("H",R.string.hgb,R.string.hgb_meaning,R.color.h),
                    new Word("H",R.string.hippa,R.string.hippa_meaning,R.color.h),
                    new Word("H",R.string.hiv,R.string.hiv_meaning,R.color.h),
                    new Word("I",R.string.ij,R.string.ij_meaning,R.color.i),
                    new Word("I",R.string.iu,R.string.iu_meaning,R.color.i),
                    new Word("K",R.string.k,R.string.k_meaning,R.color.k),
                    new Word("K",R.string.ktv,R.string.ktv_meaning,R.color.k),
                    new Word("K",R.string.kut,R.string.kut_meaning,R.color.k),
                    new Word("M",R.string.mi,R.string.mi_meaning,R.color.m),
                    new Word("N",R.string.ng,R.string.ng_meaning,R.color.n),
                    new Word("P",R.string.ph,R.string.ph_meaning,R.color.p),
                    new Word("P",R.string.pth,R.string.pth_meaning,R.color.p),
                    new Word("R",R.string.ro,R.string.ro_meaning,R.color.r),
                    new Word("S",R.string.sdhhd,R.string.sdhhd_meaning,R.color.s),
                    new Word("S",R.string.sc,R.string.sc_meaning,R.color.s),
                    new Word("T",R.string.tcv,R.string.tcv_meaning,R.color.t),
                    new Word("T",R.string.tmp,R.string.tmp_meaning,R.color.t),
                    new Word("T",R.string.tnp,R.string.tnp_meaning,R.color.t),
                    new Word("U",R.string.uf,R.string.uf_meaning,R.color.u),
                    new Word("U",R.string.ufr,R.string.ufr_meaning,R.color.u),
                    new Word("U",R.string.ukm,R.string.ukm_meaning,R.color.u),
                    new Word("U",R.string.uv,R.string.uv_meaning,R.color.u),
                    new Word("U",R.string.urr,R.string.urr_meaning,R.color.u)

            ));





    public AcronymsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       // ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.category_acronyms);
      View rootView = inflater.inflate(R.layout.words_list,container,false);

        // call the setNumberAdapter onCreate method
        setLAcronymAdapter(rootView);

        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */
        return  rootView;
    }

    public void setLAcronymAdapter(final View rV){

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

                AlertDialog.Builder meaningBuilder = new AlertDialog.Builder(getActivity());
                meaningBuilder.setMessage(description).setCancelable(false).setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alert = meaningBuilder.create();
                alert.setTitle(label);
                alert.show();

                // toast the meaning
                Toast toast = Toast.makeText(getContext(),"You have selected "+ label+ " .",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

}
