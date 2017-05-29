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

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

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

                    new Word("E",R.string.ecchymosis,R.string.ecchymosis_meaning,R.color.e),
                    new Word("E",R.string.edema,R.string.edema_meaning,R.color.e),
                    new Word("E",R.string.electrolyte,R.string.electrolyte_meaning,R.color.e),
                    new Word("E",R.string.empty_bed_contact_time,R.string.empty_bed_contact_time_meaning,R.color.e),
                    new Word("E",R.string.encephalopathy,R.string.encephalopathy_meaning,R.color.e),
                    new Word("E",R.string.endocrine_function,R.string.endocrine_function_meaning,R.color.e),
                    new Word("E",R.string.endotoxin,R.string.endotoxin_meaning,R.color.e),
                    new Word("E",R.string.equilibrium,R.string.equilibriun_meaning,R.color.e),
                    new Word("E",R.string.esrd_networks,R.string.esrd_networks_meaning,R.color.e),
                    new Word("E",R.string.extracellular,R.string.extracellular_meaning,R.color.e),
                    new Word("E",R.string.extracorporeal,R.string.extracorporeal_meaning,R.color.e),
                    new Word("E",R.string.extracorporeal_circuit,R.string.extracorporeal_circuit_meaning,R.color.e),
                    new Word("E",R.string.extracorporeal_circuit_monitors,R.string.extracorporeal_circuit_monitors_meaning,R.color.e),

                    new Word("F",R.string.ferritin,R.string.ferritin_meaning,R.color.f),
                    new Word("F",R.string.filters,R.string.filters_meaning,R.color.f),
                    new Word("F",R.string.filtration,R.string.filtration_meaning,R.color.f),
                    new Word("F",R.string.first_use_syndrome,R.string.first_use_syndrome_meaning,R.color.f),
                    new Word("F",R.string.flow,R.string.flow_meaning,R.color.f),
                    new Word("F",R.string.flow_rate,R.string.flow_rate_meaning,R.color.f),
                    new Word("F",R.string.fluid_movement,R.string.fluid_movement_meaning,R.color.f),
                    new Word("F",R.string.flush,R.string.flush_meaning,R.color.f),
                    new Word("F",R.string.formalin,R.string.formalin_meaning,R.color.f),

                    new Word("G",R.string.gradient,R.string.gradient_meaning,R.color.g),
                    new Word("G",R.string.graft,R.string.graft_meaning,R.color.g),

                    new Word("H",R.string.heat_disinfection,R.string.heat_disinfection_meaning,R.color.h),
                    new Word("H",R.string.hematocrit,R.string.hematocrit_meaning,R.color.h),
                    new Word("H",R.string.hematoma,R.string.hematoma_meaning,R.color.h),
                    new Word("H",R.string.hemodialysis,R.string.hemodialysis_meaning,R.color.h),
                    new Word("H",R.string.hemodialysis_adequacy,R.string.hemodialysis_adequacy_meaning,R.color.h),
                    new Word("H",R.string.hemodialysis_delivery_system,R.string.hemodialysis_delivery_system_meaning,R.color.h),
                    new Word("H",R.string.hemoglobin,R.string.hemoglobin_meaning,R.color.h),
                    new Word("H",R.string.hemolysis,R.string.hemolysis_meaning,R.color.h),
                    new Word("H",R.string.heparin,R.string.heparin_meaning,R.color.h),
                    new Word("H",R.string.heparin_infusion_line,R.string.heparin_infusion_line_meaning,R.color.h),
                    new Word("H",R.string.heparin_pump,R.string.heparin_pump_meaning,R.color.h),
                    new Word("H",R.string.hepatitis,R.string.hepatitis_meaning,R.color.h),
                    new Word("H",R.string.high_efficiency_dialysis,R.string.high_efficiency_dialysis_meaning,R.color.h),
                    new Word("H",R.string.high_flux_dialysis,R.string.high_flux_dialysis_meaning,R.color.h),
                    new Word("H",R.string.hippa,R.string.hippa_voc_meaning,R.color.h),
                    new Word("H",R.string.hollow_fiber_dialyzer,R.string.hollow_fiber_dialyzer_meaning,R.color.h),
                    new Word("H",R.string.homeostasis,R.string.homeostasis_meaning,R.color.h),
                    new Word("H",R.string.human_immunodeficincy_virus,R.string.human_immunodeficincy_virus_meaning,R.color.h),
                    new Word("H",R.string.hydraulic_pressure,R.string.hydraulic_pressure_meaning,R.color.h),
                    new Word("H",R.string.hydrophobic,R.string.hydrophobic_meaning,R.color.h),
                    new Word("H",R.string.hypercalcemia,R.string.hypercalcemia_meaning,R.color.h),
                    new Word("H",R.string.hyperglycemia,R.string.hypercalcemia_meaning,R.color.h),
                    new Word("H",R.string.hyperkalemia,R.string.hyperkalemia_meaning,R.color.h),
                    new Word("H",R.string.hypermagnesium,R.string.hypermagnesium_meaning,R.color.h),
                    new Word("H",R.string.hypernatremia,R.string.hypernatremia_meaning,R.color.h),
                    new Word("H",R.string.hyperphosphathemia,R.string.hyperphosphathemia_meaning,R.color.h),
                    new Word("H",R.string.hypersensitivity,R.string.hypersensitivity_meaning,R.color.h),
                    new Word("H",R.string.hypertension,R.string.hypertension_meaning,R.color.h),
                    new Word("H",R.string.hypokalemia,R.string.hypokalemia_meaning,R.color.h),
                    new Word("H",R.string.hyponatremia,R.string.hyponatremia_meaning,R.color.h),
                    new Word("H",R.string.hypotension,R.string.ferritin_meaning,R.color.h),
                    new Word("H",R.string.hypotonic_dialysate,R.string.hypotonic_dialysate_meaning,R.color.h),

                    new Word("I",R.string.infection,R.string.infection_meaning,R.color.i),
                    new Word("I",R.string.infection_control,R.string.infection_control_meaning,R.color.i),
                    new Word("I",R.string.infiltration,R.string.infiltration_meaning,R.color.i),
                    new Word("I",R.string.inflamation,R.string.inflamation_meaning,R.color.i),
                    new Word("I",R.string.intracellularn,R.string.intracellularn_meaning,R.color.i),
                    new Word("I",R.string.iron_deficiency,R.string.iron_deficiency_meaning,R.color.i),

                    new Word("K",R.string.kdigo,R.string.kdigo_meaning,R.color.k),
                    new Word("K",R.string.ktv,R.string.ktv_voc_meaning,R.color.k),
                    new Word("K",R.string.kuf,R.string.kuf_meaning,R.color.k),

                    new Word("M",R.string.metabolism,R.string.metabolism_meaning,R.color.m),
                    new Word("M",R.string.molecule,R.string.molecule_meaning,R.color.m),
                    new Word("M",R.string.morbidity,R.string.morbidity_meaning,R.color.m),
                    new Word("M",R.string.mortality,R.string.mortality_meaning,R.color.m),

                    new Word("N",R.string.needle_site_rotation,R.string.needle_site_rotation_meaning,R.color.n),
                    new Word("N",R.string.negative_pressure,R.string.negative_pressure_meaning,R.color.n),
                    new Word("N",R.string.nephrologist,R.string.nephrologist_meaning,R.color.n),
                    new Word("N",R.string.nephron,R.string.nephron,R.color.n),
                    new Word("N",R.string.normal_salin,R.string.normal_salin_meaning,R.color.n),

                    new Word("O",R.string.osmosis,R.string.osmosis_meaning,R.color.o),

                    new Word("P",R.string.palpitations,R.string.palpitations_meaning,R.color.p),
                    new Word("P",R.string.parathyroid_hormone,R.string.parathyroid_hormone_meaning,R.color.p),
                    new Word("P",R.string.pericarditis,R.string.pericarditis_meaning,R.color.p),
                    new Word("P",R.string.permeable,R.string.permeable_meaning,R.color.p),
                    new Word("P",R.string.ph,R.string.ph_voc_meaning,R.color.p),
                    new Word("P",R.string.phosphate_binder,R.string.phosphate_binder_meaning,R.color.p),
                    new Word("P",R.string.post_dialysis_pressure,R.string.post_dialysis_pressure_meaning,R.color.p),
                    new Word("P",R.string.post_pump_arterial_pressure,R.string.post_pump_arterial_meaning,R.color.p),
                    new Word("P",R.string.potassium,R.string.potassium_meaning,R.color.p),
                    new Word("P",R.string.predialyzer_presssure,R.string.predialyzer_presssure_meaning,R.color.p),
                    new Word("P",R.string.pre_pump_arterial,R.string.pre_pump_arterial_meaning,R.color.p),
                    new Word("P",R.string.pressure,R.string.pressure_meaning,R.color.p),
                    new Word("P",R.string.priming,R.string.priming_meaning,R.color.p),
                    new Word("P",R.string.pruritus,R.string.pruritus_meaning,R.color.p),
                    new Word("P",R.string.pseudoaneurysm,R.string.pseudoaneurysm_meaning,R.color.p),
                    new Word("P",R.string.pyrogen,R.string.pyrogen_meaning,R.color.p),
                    new Word("P",R.string.pyrogenic_reaction,R.string.pyrogenic_meaning,R.color.p),

                    new Word("R",R.string.recirculation,R.string.recirculation_meaning,R.color.r),
                    new Word("R",R.string.rejection,R.string.rejection_meaning,R.color.r),
                    new Word("R",R.string.reprocessing,R.string.reprocessing_meaning,R.color.r),
                    new Word("R",R.string.reverse_osmosis,R.string.reverse_osmosis_meaning,R.color.r),
                    new Word("R",R.string.rinseback,R.string.rinseback_meaning,R.color.r),

                    new Word("S",R.string.saline_infusion,R.string.saline_infusion_meaning,R.color.s),
                    new Word("S",R.string.semipermeable_membrane,R.string.semipermeable_membrane_meaning,R.color.s),
                    new Word("S",R.string.shunts,R.string.shunts_meaning,R.color.s),
                    new Word("S",R.string.sodium,R.string.sodium_meaning,R.color.s),
                    new Word("S",R.string.solute,R.string.solute_meaning,R.color.s),
                    new Word("S",R.string.solvent,R.string.solvent_meaning,R.color.s),
                    new Word("S",R.string.stenosis,R.string.stenosis_meaning,R.color.s),
                    new Word("S",R.string.stents,R.string.stents_meaning,R.color.s),
                    new Word("S",R.string.sterilant,R.string.sterilant_meaning,R.color.s),
                    new Word("S",R.string.sterile,R.string.sterile_meaning,R.color.s),
                    new Word("S",R.string.systolic,R.string.systolic_meaning,R.color.s),

                    new Word("T",R.string.temperature_alarm,R.string.temperature_alarm_meaning,R.color.t),
                    new Word("T",R.string.thrill,R.string.thrill_meaning,R.color.t),
                    new Word("T",R.string.thrombolysis,R.string.thrombolysis_meaning,R.color.t),
                    new Word("T",R.string.thrombus,R.string.thrombus_meaning,R.color.t),
                    new Word("T",R.string.tranducer_protectors,R.string.tranducer_protectors_meaning,R.color.t),
                    new Word("T",R.string.transmembrane_pressure,R.string.transmembrane_pressure_meaning,R.color.t),

                    new Word("U",R.string.ultrafiltration,R.string.ultrafiltration_meaning,R.color.u),
                    new Word("U",R.string.ufr,R.string.ufr_meaning,R.color.u),
                    new Word("U",R.string.uremia,R.string.uremia_meaning,R.color.u),
                    new Word("U",R.string.usrds,R.string.usrds_meaning,R.color.u),

                    new Word("V",R.string.venous_pressure,R.string.venous_pressure_meaning,R.color.v),
                    new Word("V",R.string.virus,R.string.virus_meaning,R.color.v),

                    new Word("W",R.string.water_softener,R.string.water_softener_meaning,R.color.w)





                    ));

    InterstitialAd mInterstitialAd;


    public VocabulariesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.category_vocabulary);
        View rootView = inflater.inflate(R.layout.words_list,container,false);

        //initialize mobile aps
        String appID  =  getActivity().getApplicationContext().getString(R.string.app_id_banner);
        MobileAds.initialize(getActivity().getApplicationContext(), appID);

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

                AlertDialog.Builder meaningBuilder  = new AlertDialog.Builder(getActivity());
                meaningBuilder.setMessage(description).setCancelable(false).setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

               AlertDialog alert  = meaningBuilder.create();
                alert.setTitle(label);
                //start next activity
                alert.show();

                // toast the meaning
                Toast toast = Toast.makeText(getContext(),"You have selected "+ label+ " .",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }




}
