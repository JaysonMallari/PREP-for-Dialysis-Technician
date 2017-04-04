package com.maxmal.www.prepfordialysistechnician;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 */
public class VocabulariesFragment extends Fragment {

    ArrayList<Word> words  = new ArrayList<Word>(
            Arrays.asList(

                    new Word("A",R.string.aami,R.string.aami_meaning,R.color.a),
                    new Word("A",R.string.abscess,R.string.abscess_meaning,R.color.a),
                    new Word("A",R.string.access,R.string.access_meaning,R.color.a),
                    new Word("A",R.string.acid,R.string.acid_meaning,R.color.a),
                    new Word("A",R.string.aids,R.string.aids_meaning,R.color.a),
                    new Word("A",R.string.acute_kidney_failure,R.string.acute_kidney_failure_meaning,R.color.a),
                    new Word("A",R.string.air_embolism,R.string.air_embolism_failure_meaning,R.color.a),
                    new Word("A",R.string.albumin,R.string.albumin_meaning,R.color.a),
                    new Word("A",R.string.alkaline,R.string.alkaline_meaning,R.color.a),
                    new Word("A",R.string.alum,R.string.alum_meaning,R.color.a),
                    new Word("A",R.string.anastomosis,R.string.anastomosis_meaning,R.color.a),
                    new Word("A",R.string.anemia,R.string.anemia_meaning,R.color.a),
                    new Word("A",R.string.aneurysm,R.string.anuerysm_meaning,R.color.a),
                    new Word("A",R.string.anticoagulant,R.string.anticoagulant_meaning,R.color.a),
                    new Word("A",R.string.antiseptics,R.string.antiseptics_meaning,R.color.a),
                    new Word("A",R.string.arrhytmia,R.string.arrhytmia_meaning,R.color.a),
                    new Word("A",R.string.arterial_pressure,R.string.arterial_pressure_meaning,R.color.a),
                    new Word("A",R.string.arterial_pressure_monitor,R.string.arterial_pressure_monitor_meaning,R.color.a),
                    new Word("A",R.string.arteriovenous_fistula,R.string.arteriovenous_fistula_meaning,R.color.a),
                    new Word("A",R.string.arteriole,R.string.arteriole_meaning,R.color.a),
                    new Word("A",R.string.artery,R.string.artery,R.color.a),
                    new Word("A",R.string.automated_peritoneal_dialysis,R.string.automated_peritoneal_dialysis_meaning,R.color.a),

                    new Word("B",R.string.backfiltration,R.string.backfiltration_meaning,R.color.b),
                    new Word("B",R.string.backwashing,R.string.backwashing_meaning,R.color.b),
                    new Word("B",R.string.bacteria,R.string.bacteria_meaning,R.color.b),
                    new Word("B",R.string.base,R.string.base_meaning,R.color.b),
                    new Word("B",R.string.bicarbonate,R.string.bicarbonate_meaning,R.color.b),
                    new Word("B",R.string.blood_leak,R.string.blood_leak_meaning,R.color.b),
                    new Word("B",R.string.blood_leak_detector,R.string.blood_leak_detector_meaning,R.color.b),
                    new Word("B",R.string.blood_pump,R.string.blood_pump_meaning,R.color.b),
                    new Word("B",R.string.blood_pump_segment,R.string.blood_pump_segment_meaning,R.color.b),
                    new Word("B",R.string.blood_urea_nitrogen,R.string.blood_urea_nitrogen_meaning,R.color.b),
                    new Word("B",R.string.brachial_pulse,R.string.brachial_pulse_meaning,R.color.b),
                    new Word("B",R.string.brine,R.string.brine_meaning,R.color.b),
                    new Word("B",R.string.bruit,R.string.bruit_meaning,R.color.b),
                    new Word("B",R.string.buffer,R.string.buffer_meaning,R.color.b),
                    new Word("B",R.string.button_hole_technique,R.string.button_hole_technique_meaning,R.color.b),
                    new Word("B",R.string.bypass,R.string.bypass_meaning,R.color.b),

                    new Word("C",R.string.calcium,R.string.calcium_meaning,R.color.c),
                    new Word("C",R.string.cannulate,R.string.cannulate_meaning,R.color.c),
                    new Word("C",R.string.capillaries,R.string.capillaries_meaning,R.color.c),
                    new Word("C",R.string.carbon_tank,R.string.carbon_tank_meaning,R.color.c),
                    new Word("C",R.string.cardiac_arrest,R.string.cardiac_arrest_meaning,R.color.c),
                    new Word("C",R.string.catheter,R.string.catheter_meaning,R.color.c),
                    new Word("C",R.string.chlorine,R.string.chlorine_meaning,R.color.c),
                    new Word("C",R.string.chronic_kidney_disease,R.string.chronic_kidney_disease_meaning,R.color.c),
                    new Word("C",R.string.clearance,R.string.clearance_meaning,R.color.c),
                    new Word("C",R.string.clinical_practice_guidelines,R.string.clinical_practice_guidelines_meaning,R.color.c),
                    new Word("C",R.string.coefficient_ultrfiltration,R.string.coefficient_ultrfiltration_meaning,R.color.c),
                    new Word("C",R.string.conductivity,R.string.conductivity_meaning,R.color.c),
                    new Word("C",R.string.conductivity_monitor,R.string.conductivity_monitor_meaning,R.color.c),
                    new Word("C",R.string.countercurrent_flow,R.string.countercurrent_flow_meaning,R.color.c),
                    new Word("C",R.string.creatinine,R.string.creatinine_meaning,R.color.c),
                    new Word("C",R.string.creatinine_clearance,R.string.creatinine_clearance_meaning,R.color.c),
                    new Word("C",R.string.crenation,R.string.crenation_meaning,R.color.c),

                    new Word("D",R.string.dehydration,R.string.dehydration_meaning,R.color.d),
                    new Word("D",R.string.diabetic_nephropathy,R.string.diabetic_nephropathy_meaning,R.color.d),
                    new Word("D",R.string.dialysate,R.string.dialysate_meaning,R.color.d),
                    new Word("D",R.string.dialysis,R.string.dialysis_meaning,R.color.d),
                    new Word("D",R.string.dialysis_disequilibrium_syndrome,R.string.dialysis_disequilibrium_syndrome_meaning,R.color.d),
                    new Word("D",R.string.dialyzer,R.string.dialyzer_meaning,R.color.d),
                    new Word("D",R.string.diastolic,R.string.diastolic_meaning,R.color.d),
                    new Word("D",R.string.dry_weigth,R.string.dry_weigth_meaning,R.color.d),
                    new Word("D",R.string.dyspnea,R.string.dyspnea_meaning,R.color.d),





            ));


    public VocabulariesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.category_vocabulary);
        View rootView = inflater.inflate(R.layout.words_list,container,false);

        // call the setNumberAdapter onCreate method
        setLAcronymAdapter(rootView);

        return rootView;
    }

    public void setLAcronymAdapter(View rV){

        // Construct a new word adapter
        WordAdapter adapter  = new WordAdapter(getActivity(), words);

        // cast the listview
        ListView listView = (ListView) rV.findViewById(R.id.list);

        //set the adapter to the listview
        listView.setAdapter(adapter);
    }


}
