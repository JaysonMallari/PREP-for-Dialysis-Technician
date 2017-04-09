package com.maxmal.www.prepfordialysistechnician;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class TestActivity extends AppCompatActivity {

    ArrayList<Word> testString = new ArrayList<Word>(
       Arrays.asList(
               new Word(R.string.one, R.string.one_a, R.string.one_b, R.string.one_c, R.string.one_d, R.string.one_ans, R.id.choice_b ),
               new Word(R.string.two, R.string.two_a, R.string.two_b, R.string.two_c, R.string.two_d, R.string.two_ans, R.id.choice_d ),
               new Word(R.string.three, R.string.three_a, R.string.three_b, R.string.three_c, R.string.three_d, R.string.three_ans,R.id.choice_c ),
               new Word(R.string.four, R.string.four_a, R.string.four_b, R.string.four_c, R.string.four_d, R.string.four_ans, R.id.choice_d ),
               new Word(R.string.five, R.string.five_a, R.string.five_b, R.string.five_c, R.string.five_d, R.string.five_ans, R.id.choice_d ),
               new Word(R.string.six, R.string.six_a, R.string.six_b, R.string.six_c, R.string.six_d, R.string.six_ans, R.id.choice_b ),
               new Word(R.string.seven, R.string.seven_a, R.string.seven_b, R.string.seven_c, R.string.seven_d, R.string.seven_ans, R.id.choice_c ),
               new Word(R.string.eight, R.string.eight_a, R.string.eight_b, R.string.eight_c, R.string.eight_d, R.string.eight_ans,R.id.choice_a ),
               new Word(R.string.nine, R.string.nine_a, R.string.nine_b, R.string.nine_c, R.string.nine_d, R.string.nine_ans, R.id.choice_d ),
               new Word(R.string.ten, R.string.ten_a, R.string.ten_b, R.string.ten_c, R.string.ten_d, R.string.ten_ans, R.id.choice_a ),

               new Word(R.string.eleven, R.string.eleven_a, R.string.eleven_b, R.string.eleven_c, R.string.eleven_d, R.string.eleven_ans, R.id.choice_d ),
               new Word(R.string.twelve, R.string.twelve_a, R.string.twelve_b, R.string.twelve_c, R.string.twelve_d, R.string.twelve_ans, R.id.choice_c ),
               new Word(R.string.thirteen, R.string.thirteen_a, R.string.thirteen_b, R.string.thirteen_c, R.string.thirteen_d, R.string.thirteen_ans, R.id.choice_d ),
               new Word(R.string.fourteen, R.string.fourteen_a, R.string.fourteen_b, R.string.fourteen_c, R.string.fourteen_d, R.string.fourteen_ans, R.id.choice_b ),
               new Word(R.string.fifteen, R.string.fifteen_a, R.string.fifteen_b, R.string.fifteen_c, R.string.fifteen_d, R.string.fifteen_ans, R.id.choice_a ),
               new Word(R.string.sixteen, R.string.sixteen_a, R.string.sixteen_b, R.string.sixteen_c, R.string.sixteen_d, R.string.sixteen_ans, R.id.choice_d ),
               new Word(R.string.seventeen, R.string.seventeen_a, R.string.seventeen_b, R.string.seventeen_c, R.string.seventeen_d, R.string.seventeen_ans, R.id.choice_c ),
               new Word(R.string.eighteen, R.string.eighteen_a, R.string.eighteen_b, R.string.eighteen_c, R.string.eighteen_d, R.string.eighteen_ans, R.id.choice_a ),
               new Word(R.string.nineteen, R.string.nineteen_a, R.string.nineteen_b, R.string.nineteen_c, R.string.nineteen_d, R.string.nineteen_ans, R.id.choice_c ),
               new Word(R.string.twenty, R.string.twenty_a, R.string.twenty_b, R.string.twenty_c, R.string.twenty_d, R.string.twenty_ans, R.id.choice_a ),

               new Word(R.string.twenty1, R.string.twenty1_a, R.string.twenty1_b, R.string.twenty1_c, R.string.twenty1_d, R.string.twenty1_ans, R.id.choice_d ),
               new Word(R.string.twenty2, R.string.twenty2_a, R.string.twenty2_b, R.string.twenty2_c, R.string.twenty2_d, R.string.twenty2_ans, R.id.choice_c ),
               new Word(R.string.twenty3, R.string.twenty3_a, R.string.twenty3_b, R.string.twenty3_c, R.string.twenty3_d, R.string.twenty3_ans, R.id.choice_b ),
               new Word(R.string.twenty4, R.string.twenty4_a, R.string.twenty4_b, R.string.twenty4_c, R.string.twenty4_d, R.string.twenty4_ans, R.id.choice_b ),
               new Word(R.string.twenty5, R.string.twenty5_a, R.string.twenty5_b, R.string.twenty5_c, R.string.twenty5_d, R.string.twenty5_ans, R.id.choice_a ),
               new Word(R.string.twenty6, R.string.twenty6_a, R.string.twenty6_b, R.string.twenty6_c, R.string.twenty6_d, R.string.twenty6_ans, R.id.choice_d ),
               new Word(R.string.twenty7, R.string.twenty7_a, R.string.twenty7_b, R.string.twenty7_c, R.string.twenty7_d, R.string.twenty7_ans, R.id.choice_d ),
               new Word(R.string.twenty8, R.string.twenty8_a, R.string.twenty8_b, R.string.twenty8_c, R.string.twenty8_d, R.string.twenty8_ans, R.id.choice_c ),
               new Word(R.string.twenty9, R.string.twenty9_a, R.string.twenty9_b, R.string.twenty9_c, R.string.twenty9_d, R.string.twenty9_ans, R.id.choice_d ),
               new Word(R.string.thirty, R.string.thirty_a, R.string.thirty_b, R.string.thirty_c, R.string.thirty_d, R.string.thirty_ans, R.id.choice_d ),

               new Word(R.string.thirty1, R.string.thirty1_a, R.string.thirty1_b, R.string.thirty1_c, R.string.thirty1_d, R.string.thirty1_ans, R.id.choice_b ),
               new Word(R.string.thirty2, R.string.thirty2_a, R.string.thirty2_b, R.string.thirty2_c, R.string.thirty2_d, R.string.thirty2_ans, R.id.choice_d ),
               new Word(R.string.thirty3, R.string.thirty3_a, R.string.thirty3_b, R.string.thirty3_c, R.string.thirty3_d, R.string.thirty3_ans, R.id.choice_c ),
               new Word(R.string.thirty4, R.string.thirty4_a, R.string.thirty4_b, R.string.thirty4_c, R.string.thirty4_d, R.string.thirty4_ans, R.id.choice_b ),
               new Word(R.string.thirty5, R.string.thirty5_a, R.string.thirty5_b, R.string.thirty5_c, R.string.thirty5_d, R.string.thirty5_ans, R.id.choice_c ),
               new Word(R.string.thirty6, R.string.thirty6_a, R.string.thirty6_b, R.string.thirty6_c, R.string.thirty6_d, R.string.thirty6_ans, R.id.choice_a ),
               new Word(R.string.thirty7, R.string.thirty7_a, R.string.thirty7_b, R.string.thirty7_c, R.string.thirty7_d, R.string.thirty7_ans, R.id.choice_d ),
               new Word(R.string.thirty8, R.string.thirty8_a, R.string.thirty8_b, R.string.thirty8_c, R.string.thirty8_d, R.string.thirty8_ans, R.id.choice_b ),
               new Word(R.string.thirty9, R.string.thirty9_a, R.string.thirty9_b, R.string.thirty9_c, R.string.thirty9_d, R.string.thirty9_ans, R.id.choice_d ),
               new Word(R.string.fourty, R.string.fourty_a, R.string.fourty_b, R.string.fourty_c, R.string.fourty_d, R.string.fourty_ans, R.id.choice_c ),

               new Word(R.string.fourty1, R.string.fourty1_a, R.string.fourty1_b, R.string.fourty1_c, R.string.fourty1_d, R.string.fourty1_ans, R.id.choice_a ),
               new Word(R.string.fourty2, R.string.fourty2_a, R.string.fourty2_b, R.string.fourty2_c, R.string.fourty2_d, R.string.fourty2_ans, R.id.choice_b ),
               new Word(R.string.fourty3, R.string.fourty3_a, R.string.fourty3_b, R.string.fourty3_c, R.string.fourty3_d, R.string.fourty3_ans, R.id.choice_b ),
               new Word(R.string.fourty4, R.string.fourty4_a, R.string.fourty4_b, R.string.fourty4_c, R.string.fourty4_d, R.string.fourty4_ans, R.id.choice_a ),
               new Word(R.string.fourty5, R.string.fourty5_a, R.string.fourty5_b, R.string.fourty5_c, R.string.fourty5_d, R.string.fourty5_ans, R.id.choice_b ),
               new Word(R.string.fourty6, R.string.fourty6_a, R.string.fourty6_b, R.string.fourty6_c, R.string.fourty6_d, R.string.fourty6_ans, R.id.choice_c ),
               new Word(R.string.fourty7, R.string.fourty7_a, R.string.fourty7_b, R.string.fourty7_c, R.string.fourty7_d, R.string.fourty7_ans, R.id.choice_b ),
               new Word(R.string.fourty8, R.string.fourty8_a, R.string.fourty8_b, R.string.fourty8_c, R.string.fourty8_d, R.string.fourty8_ans, R.id.choice_d ),
               new Word(R.string.fourty9, R.string.fourty9_a, R.string.fourty9_b, R.string.fourty9_c, R.string.fourty9_d, R.string.fourty9_ans, R.id.choice_a ),

               new Word(R.string.fifty, R.string.fifty_a, R.string.fifty_b, R.string.fifty_c, R.string.fifty_d, R.string.fifty_ans, R.id.choice_c ),
               new Word(R.string.fifty1, R.string.fifty1_a, R.string.fifty1_b, R.string.fifty1_c, R.string.fifty1_d, R.string.fifty1_ans, R.id.choice_b ),
               new Word(R.string.fifty2, R.string.fifty2_a, R.string.fifty2_b, R.string.fifty2_c, R.string.fifty2_d, R.string.fifty2_ans, R.id.choice_a ),
               new Word(R.string.fifty3, R.string.fifty3_a, R.string.fifty3_b, R.string.fifty3_c, R.string.fifty3_d, R.string.fifty3_ans, R.id.choice_c ),
               new Word(R.string.fifty4, R.string.fifty4_a, R.string.fifty4_b, R.string.fifty4_c, R.string.fifty4_d, R.string.fifty4_ans, R.id.choice_a ),
               new Word(R.string.fifty5, R.string.fifty5_a, R.string.fifty5_b, R.string.fifty5_c, R.string.fifty5_d, R.string.fifty5_ans, R.id.choice_d ),
               new Word(R.string.fifty6, R.string.fifty6_a, R.string.fifty6_b, R.string.fifty6_c, R.string.fifty6_d, R.string.fifty6_ans, R.id.choice_b ),
               new Word(R.string.fifty7, R.string.fifty7_a, R.string.fifty7_b, R.string.fifty7_c, R.string.fifty7_d, R.string.fifty7_ans, R.id.choice_d ),
               new Word(R.string.fifty8, R.string.fifty8_a, R.string.fifty8_b, R.string.fifty8_c, R.string.fifty8_d, R.string.fifty8_ans, R.id.choice_c ),
               new Word(R.string.fifty9, R.string.fifty9_a, R.string.fifty9_b, R.string.fifty9_c, R.string.fifty9_d, R.string.fifty9_ans, R.id.choice_d ),

               new Word(R.string.sixty, R.string.sixty_a, R.string.sixty_b, R.string.sixty_c, R.string.sixty_d, R.string.sixty_ans, R.id.choice_a ),
               new Word(R.string.sixty1, R.string.sixty1_a, R.string.sixty1_b, R.string.sixty1_c, R.string.sixty1_d, R.string.sixty1_ans, R.id.choice_d ),
               new Word(R.string.sixty2, R.string.sixty2_a, R.string.sixty2_b, R.string.sixty2_c, R.string.sixty2_d, R.string.sixty2_ans, R.id.choice_b ),
               new Word(R.string.sixty3, R.string.sixty3_a, R.string.sixty3_b, R.string.sixty3_c, R.string.sixty3_d, R.string.sixty3_ans, R.id.choice_c ),
               new Word(R.string.sixty4, R.string.sixty4_a, R.string.sixty4_b, R.string.sixty4_c, R.string.sixty4_d, R.string.sixty4_ans, R.id.choice_d ),
               new Word(R.string.sixty5, R.string.sixty5_a, R.string.sixty5_b, R.string.sixty5_c, R.string.sixty5_d, R.string.sixty5_ans, R.id.choice_a ),
               new Word(R.string.sixty6, R.string.sixty6_a, R.string.sixty6_b, R.string.sixty6_c, R.string.sixty6_d, R.string.sixty6_ans, R.id.choice_d ),
               new Word(R.string.sixty7, R.string.sixty7_a, R.string.sixty7_b, R.string.sixty7_c, R.string.sixty7_d, R.string.sixty7_ans, R.id.choice_c ),
               new Word(R.string.sixty8, R.string.sixty8_a, R.string.sixty8_b, R.string.sixty8_c, R.string.sixty8_d, R.string.sixty8_ans, R.id.choice_b ),
               new Word(R.string.sixty9, R.string.sixty9_a, R.string.sixty9_b, R.string.sixty9_c, R.string.sixty9_d, R.string.sixty9_ans, R.id.choice_c ),

               new Word(R.string.seventy, R.string.seventy_a, R.string.seventy_b, R.string.seventy_c, R.string.seventy_d, R.string.seventy_ans, R.id.choice_a ),
               new Word(R.string.seventy1, R.string.seventy1_a, R.string.seventy1_b, R.string.seventy1_c, R.string.seventy1_d, R.string.seventy1_ans, R.id.choice_c ),
               new Word(R.string.seventy2, R.string.seventy2_a, R.string.seventy2_b, R.string.seventy2_c, R.string.seventy2_d, R.string.seventy2_ans, R.id.choice_b),
               new Word(R.string.seventy3, R.string.seventy3_a, R.string.seventy3_b, R.string.seventy3_c, R.string.seventy3_d, R.string.seventy3_ans, R.id.choice_d ),
               new Word(R.string.seventy4, R.string.seventy4_a, R.string.seventy4_b, R.string.seventy4_c, R.string.seventy4_d, R.string.seventy4_ans, R.id.choice_a ),
               new Word(R.string.seventy5, R.string.seventy5_a, R.string.seventy5_b, R.string.seventy5_c, R.string.seventy5_d, R.string.seventy5_ans, R.id.choice_c ),
               new Word(R.string.seventy6, R.string.seventy6_a, R.string.seventy6_b, R.string.seventy6_c, R.string.seventy6_d, R.string.seventy6_ans, R.id.choice_b ),
               new Word(R.string.seventy7, R.string.seventy7_a, R.string.seventy7_b, R.string.seventy7_c, R.string.seventy7_d, R.string.seventy7_ans, R.id.choice_c ),
               new Word(R.string.seventy8, R.string.seventy8_a, R.string.seventy8_b, R.string.seventy8_c, R.string.seventy8_d, R.string.seventy8_ans, R.id.choice_b ),
               new Word(R.string.seventy9, R.string.seventy9_a, R.string.seventy9_b, R.string.seventy9_c, R.string.seventy9_d, R.string.seventy9_ans, R.id.choice_c ),

               new Word(R.string.eigthy, R.string.eigthy_a, R.string.eigthy_b, R.string.eigthy_c, R.string.eigthy_d, R.string.eigthy_ans, R.id.choice_d ),
               new Word(R.string.eigthy1, R.string.eigthy1_a, R.string.eigthy1_b, R.string.eigthy1_c, R.string.eigthy1_d, R.string.eigthy1_ans, R.id.choice_b ),
               new Word(R.string.eigthy2, R.string.eigthy2_a, R.string.eigthy2_b, R.string.eigthy2_c, R.string.eigthy2_d, R.string.eigthy2_ans, R.id.choice_a ),
               new Word(R.string.eigthy3, R.string.eigthy3_a, R.string.eigthy3_b, R.string.eigthy3_c, R.string.eigthy3_d, R.string.eigthy3_ans, R.id.choice_c ),
               new Word(R.string.eigthy4, R.string.eigthy4_a, R.string.eigthy4_b, R.string.eigthy4_c, R.string.eigthy4_d, R.string.eigthy4_ans, R.id.choice_d ),
               new Word(R.string.eigthy5, R.string.eigthy5_a, R.string.eigthy5_b, R.string.eigthy5_c, R.string.eigthy5_d, R.string.eigthy5_ans, R.id.choice_a ),
               new Word(R.string.eigthy6, R.string.eigthy6_a, R.string.eigthy6_b, R.string.eigthy6_c, R.string.eigthy6_d, R.string.eigthy6_ans, R.id.choice_c ),
               new Word(R.string.eigthy7, R.string.eigthy7_a, R.string.eigthy7_b, R.string.eigthy7_c, R.string.eigthy7_d, R.string.eigthy7_ans, R.id.choice_b ),
               new Word(R.string.eigthy8, R.string.eigthy8_a, R.string.eigthy8_b, R.string.eigthy8_c, R.string.eigthy8_d, R.string.eigthy8_ans, R.id.choice_d ),
               new Word(R.string.eigthy9, R.string.eigthy9_a, R.string.eigthy9_b, R.string.eigthy9_c, R.string.eigthy9_d, R.string.eigthy9_ans, R.id.choice_c ),

               new Word(R.string.ninety, R.string.ninety_a, R.string.ninety_b, R.string.ninety_c, R.string.ninety_d, R.string.ninety_ans,R.id.choice_a ),
               new Word(R.string.ninety1, R.string.ninety1_a, R.string.ninety1_b, R.string.ninety1_c, R.string.ninety1_d, R.string.ninety1_ans, R.id.choice_c ),
               new Word(R.string.ninety2, R.string.ninety2_a, R.string.ninety2_b, R.string.ninety2_c, R.string.ninety2_d, R.string.ninety2_ans, R.id.choice_b ),
               new Word(R.string.ninety3, R.string.ninety3_a, R.string.ninety3_b, R.string.ninety3_c, R.string.ninety3_d, R.string.ninety3_ans, R.id.choice_d ),
               new Word(R.string.ninety4, R.string.ninety4_a, R.string.ninety4_b, R.string.ninety4_c, R.string.ninety4_d, R.string.ninety4_ans, R.id.choice_b ),
               new Word(R.string.ninety5, R.string.ninety5_a, R.string.ninety5_b, R.string.ninety5_c, R.string.ninety5_d, R.string.ninety5_ans, R.id.choice_a ),
               new Word(R.string.ninety6, R.string.ninety6_a, R.string.ninety6_b, R.string.ninety6_c, R.string.ninety6_d, R.string.ninety6_ans, R.id.choice_c ),
               new Word(R.string.ninety7, R.string.ninety7_a, R.string.ninety7_b, R.string.ninety7_c, R.string.ninety7_d, R.string.ninety7_ans, R.id.choice_c ),
               new Word(R.string.ninety8, R.string.ninety8_a, R.string.ninety8_b, R.string.ninety8_c, R.string.ninety8_d, R.string.ninety8_ans, R.id.choice_a ),
               new Word(R.string.ninety9, R.string.ninety9_a, R.string.ninety9_b, R.string.ninety9_c, R.string.ninety9_d, R.string.ninety9_ans, R.id.choice_c ),

               new Word(R.string.h00, R.string.h00_a, R.string.h00_b, R.string.h00_c, R.string.h00_d, R.string.h00_ans, R.id.choice_b ),
               new Word(R.string.h001, R.string.h001_a, R.string.h001_b, R.string.h001_c, R.string.h001_d, R.string.h001_ans, R.id.choice_d ),
               new Word(R.string.h002, R.string.h002_a, R.string.h002_b, R.string.h002_c, R.string.h002_d, R.string.h002_ans, R.id.choice_a ),
               new Word(R.string.h003, R.string.h003_a, R.string.h003_b, R.string.h003_c, R.string.h003_d, R.string.h003_ans, R.id.choice_c ),
               new Word(R.string.h004, R.string.h004_a, R.string.h004_b, R.string.h004_c, R.string.h004_d, R.string.h004_ans, R.id.choice_b ),
               new Word(R.string.h005, R.string.h005_a, R.string.h005_b, R.string.h005_c, R.string.h005_d, R.string.h005_ans, R.id.choice_a ),
               new Word(R.string.h006, R.string.h006_a, R.string.h006_b, R.string.h006_c, R.string.h006_d, R.string.h006_ans, R.id.choice_c ),
               new Word(R.string.h007, R.string.h007_a, R.string.h007_b, R.string.h007_c, R.string.h007_d, R.string.h007_ans, R.id.choice_d ),
               new Word(R.string.h008, R.string.h008_a, R.string.h008_b, R.string.h008_c, R.string.h008_d, R.string.h008_ans, R.id.choice_b ),
               new Word(R.string.h009, R.string.h009_a, R.string.h009_b, R.string.h009_c, R.string.h009_d, R.string.h009_ans, R.id.choice_c ),

               new Word(R.string.h0010, R.string.h0010_a, R.string.h0010_b, R.string.h0010_c, R.string.h0010_d, R.string.h0010_ans, R.id.choice_d ),
               new Word(R.string.h0011, R.string.h0011_a, R.string.h0011_b, R.string.h0011_c, R.string.h0011_d, R.string.h0011_ans, R.id.choice_a ),
               new Word(R.string.h0012, R.string.h0012_a, R.string.h0012_b, R.string.h0012_c, R.string.h0012_d, R.string.h0012_ans, R.id.choice_c ),
               new Word(R.string.h0013, R.string.h0013_a, R.string.h0013_b, R.string.h0013_c, R.string.h0013_d, R.string.h0013_ans, R.id.choice_d ),
               new Word(R.string.h0014, R.string.h0014_a, R.string.h0014_b, R.string.h0014_c, R.string.h0014_d, R.string.h0014_ans, R.id.choice_b ),
               new Word(R.string.h0015, R.string.h0015_a, R.string.h0015_b, R.string.h0015_c, R.string.h0015_d, R.string.h0015_ans, R.id.choice_c ),
               new Word(R.string.h0016, R.string.h0016_a, R.string.h0016_b, R.string.h0016_c, R.string.h0016_d, R.string.h0016_ans, R.id.choice_a ),
               new Word(R.string.h0017, R.string.h0017_a, R.string.h0017_b, R.string.h0017_c, R.string.h0017_d, R.string.h0017_ans, R.id.choice_d ),
               new Word(R.string.h0018, R.string.h0018_a, R.string.h0018_b, R.string.h0018_c, R.string.h0018_d, R.string.h0018_ans, R.id.choice_c ),
               new Word(R.string.h0019, R.string.h0019_a, R.string.h0019_b, R.string.h0019_c, R.string.h0019_d, R.string.h0019_ans, R.id.choice_d ),

               new Word(R.string.h0020, R.string.h0020_a, R.string.h0020_b, R.string.h0020_c, R.string.h0020_d, R.string.h0020_ans, R.id.choice_c ),
               new Word(R.string.h0021, R.string.h0021_a, R.string.h0021_b, R.string.h0021_c, R.string.h0021_d, R.string.h0021_ans, R.id.choice_a ),
               new Word(R.string.h0022, R.string.h0022_a, R.string.h0022_b, R.string.h0022_c, R.string.h0022_d, R.string.h0022_ans, R.id.choice_b ),
               new Word(R.string.h0023, R.string.h0023_a, R.string.h0023_b, R.string.h0023_c, R.string.h0023_d, R.string.h0023_ans, R.id.choice_d ),
               new Word(R.string.h0024, R.string.h0024_a, R.string.h0024_b, R.string.h0024_c, R.string.h0024_d, R.string.h0024_ans, R.id.choice_a ),
               new Word(R.string.h0025, R.string.h0025_a, R.string.h0025_b, R.string.h0025_c, R.string.h0025_d, R.string.h0025_ans, R.id.choice_d ),
               new Word(R.string.h0026, R.string.h0026_a, R.string.h0026_b, R.string.h0026_c, R.string.h0026_d, R.string.h0026_ans, R.id.choice_b ),
               new Word(R.string.h0027, R.string.h0027_a, R.string.h0027_b, R.string.h0027_c, R.string.h0027_d, R.string.h0027_ans, R.id.choice_d ),
               new Word(R.string.h0028, R.string.h0028_a, R.string.h0028_b, R.string.h0028_c, R.string.h0028_d, R.string.h0028_ans, R.id.choice_c ),
               new Word(R.string.h0029, R.string.h0029_a, R.string.h0029_b, R.string.h0029_c, R.string.h0029_d, R.string.h0029_ans, R.id.choice_b ),

               new Word(R.string.h0030, R.string.h0030_a, R.string.h0030_b, R.string.h0030_c, R.string.h0030_d, R.string.h0030_ans, R.id.choice_a )

       ));

    public int totalScore = 0;
    private int position = 0;
    private TextView questionTV;
    private RadioButton choiceArb,choiceBrb,choiceCrb,choiceDrb;
    private Word getWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        test();
    }

    public void test(){
        // cast the question TextView
         questionTV = (TextView) findViewById(R.id.question);
        // cast the Choices Radio Button
        choiceArb = (RadioButton) findViewById(R.id.choice_a);
        choiceBrb = (RadioButton) findViewById(R.id.choice_b);
        choiceCrb = (RadioButton) findViewById(R.id.choice_c);
        choiceDrb = (RadioButton) findViewById(R.id.choice_d);


        // set the string to the question and choices.
        setQuestionAndChoices();

        //Cast the show the description Button
        Button descriptionButton = (Button) findViewById(R.id.check_description);

        //Cast the submit/next button
        Button nextButton = (Button) findViewById(R.id.next_button);

        descriptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getResources().getString(getWord.getmDescription());
                Toast toast = Toast.makeText(TestActivity.this,"Answer View",Toast.LENGTH_SHORT);
                toast.show();

                AlertDialog.Builder builder = new AlertDialog.Builder(TestActivity.this);
                builder.setMessage(description).setCancelable(false).setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.setTitle("Answer");
                alertDialog.show();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton checkAnswer  = (RadioButton) findViewById(getWord.getmAnswer());
                if( checkAnswer.isChecked()){
                    totalScore += 1;
                }

                if(position < (testString.size() - 1)){
                    position += 1;
                    setQuestionAndChoices();
                }
                else{
                    final Dialog dialog = new Dialog(TestActivity.this);
                    dialog.setContentView(R.layout.test_score);
                    dialog.setTitle("Test PREP Result");

                    TextView score = (TextView) dialog.findViewById(R.id.score_digits);
                    score.setText(String.valueOf(totalScore)+"/130");

                    Button tryAgain = (Button) dialog.findViewById(R.id.try_again);
                    tryAgain.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(TestActivity.this,TestActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });

                    Button exitToMain = (Button) dialog.findViewById(R.id.main_menu);
                    exitToMain.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(TestActivity.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });

                    dialog.show();
                }
            }
        });

    }

    public void setQuestionAndChoices(){
        // get the corresponding value by position from ArrayList
        getWord = testString.get(position);

        // get the question string value
        questionTV.setText(getWord.getmQuestion());
        // get the choices string value
        choiceArb.setText(getWord.getmChoiceA());
        choiceBrb.setText(getWord.getmChoiceB());
        choiceCrb.setText(getWord.getmChoiceC());
        choiceDrb.setText(getWord.getmChoiceD());

    }
}
