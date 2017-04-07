package com.maxmal.www.prepfordialysistechnician;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class TestActivity extends AppCompatActivity {

    ArrayList<Word> test = new ArrayList<Word>(
       Arrays.asList(
               new Word(R.string.one, R.string.one_a, R.string.one_b, R.string.one_c, R.string.one_d, R.string.one_ans, R.string.one_b ),
               new Word(R.string.two, R.string.two_a, R.string.two_b, R.string.two_c, R.string.two_d, R.string.two_ans, R.string.two_d ),
               new Word(R.string.three, R.string.three_a, R.string.three_b, R.string.three_c, R.string.three_d, R.string.three_ans, R.string.three_c ),
               new Word(R.string.four, R.string.four_a, R.string.four_b, R.string.four_c, R.string.four_d, R.string.four_ans, R.string.four_d ),
               new Word(R.string.five, R.string.five_a, R.string.five_b, R.string.five_c, R.string.five_d, R.string.five_ans, R.string.five_d ),
               new Word(R.string.six, R.string.six_a, R.string.six_b, R.string.six_c, R.string.six_d, R.string.six_ans, R.string.six_b ),
               new Word(R.string.seven, R.string.seven_a, R.string.seven_b, R.string.seven_c, R.string.seven_d, R.string.seven_ans, R.string.seven_c ),
               new Word(R.string.eight, R.string.eight_a, R.string.eight_b, R.string.eight_c, R.string.eight_d, R.string.eight_ans, R.string.eight_a ),
               new Word(R.string.nine, R.string.nine_a, R.string.nine_b, R.string.nine_c, R.string.nine_d, R.string.nine_ans, R.string.nine_d ),
               new Word(R.string.ten, R.string.ten_a, R.string.ten_b, R.string.ten_c, R.string.ten_d, R.string.ten_ans, R.string.ten_a ),

               new Word(R.string.eleven, R.string.eleven_a, R.string.eleven_b, R.string.eleven_c, R.string.eleven_d, R.string.eleven_ans, R.string.eleven_d ),
               new Word(R.string.twelve, R.string.twelve_a, R.string.twelve_b, R.string.twelve_c, R.string.twelve_d, R.string.twelve_ans, R.string.twelve_c ),
               new Word(R.string.thirteen, R.string.thirteen_a, R.string.thirteen_b, R.string.thirteen_c, R.string.thirteen_d, R.string.thirteen_ans, R.string.thirteen_d ),
               new Word(R.string.fourteen, R.string.fourteen_a, R.string.fourteen_b, R.string.fourteen_c, R.string.fourteen_d, R.string.fourteen_ans, R.string.fourteen_b ),
               new Word(R.string.fifteen, R.string.fifteen_a, R.string.fifteen_b, R.string.fifteen_c, R.string.fifteen_d, R.string.fifteen_ans, R.string.fifteen_a ),
               new Word(R.string.sixteen, R.string.sixteen_a, R.string.sixteen_b, R.string.sixteen_c, R.string.sixteen_d, R.string.sixteen_ans, R.string.sixteen_d ),
               new Word(R.string.seventeen, R.string.seventeen_a, R.string.seventeen_b, R.string.seventeen_c, R.string.seventeen_d, R.string.seventeen_ans, R.string.seventeen_c ),
               new Word(R.string.eighteen, R.string.eighteen_a, R.string.eighteen_b, R.string.eighteen_c, R.string.eighteen_d, R.string.eighteen_ans, R.string.eighteen_a ),
               new Word(R.string.nineteen, R.string.nineteen_a, R.string.nineteen_b, R.string.nineteen_c, R.string.nineteen_d, R.string.nineteen_ans, R.string.nineteen_c ),
               new Word(R.string.twenty, R.string.twenty_a, R.string.twenty_b, R.string.twenty_c, R.string.twenty_d, R.string.twenty_ans, R.string.twenty_a ),

               new Word(R.string.twenty1, R.string.twenty1_a, R.string.twenty1_b, R.string.twenty1_c, R.string.twenty1_d, R.string.twenty1_ans, R.string.twenty1_d ),
               new Word(R.string.twenty2, R.string.twenty2_a, R.string.twenty2_b, R.string.twenty2_c, R.string.twenty2_d, R.string.twenty2_ans, R.string.twenty2_c ),
               new Word(R.string.twenty3, R.string.twenty3_a, R.string.twenty3_b, R.string.twenty3_c, R.string.twenty3_d, R.string.twenty3_ans, R.string.twenty3_b ),
               new Word(R.string.twenty4, R.string.twenty4_a, R.string.twenty4_b, R.string.twenty4_c, R.string.twenty4_d, R.string.twenty4_ans, R.string.twenty4_b ),
               new Word(R.string.twenty5, R.string.twenty5_a, R.string.twenty5_b, R.string.twenty5_c, R.string.twenty5_d, R.string.twenty5_ans, R.string.twenty5_a ),
               new Word(R.string.twenty6, R.string.twenty6_a, R.string.twenty6_b, R.string.twenty6_c, R.string.twenty6_d, R.string.twenty6_ans, R.string.twenty6_d ),
               new Word(R.string.twenty7, R.string.twenty7_a, R.string.twenty7_b, R.string.twenty7_c, R.string.twenty7_d, R.string.twenty7_ans, R.string.twenty7_d ),
               new Word(R.string.twenty8, R.string.twenty8_a, R.string.twenty8_b, R.string.twenty8_c, R.string.twenty8_d, R.string.twenty8_ans, R.string.twenty8_c ),
               new Word(R.string.twenty9, R.string.twenty9_a, R.string.twenty9_b, R.string.twenty9_c, R.string.twenty9_d, R.string.twenty9_ans, R.string.twenty9_d ),
               new Word(R.string.thirty, R.string.thirty_a, R.string.thirty_b, R.string.thirty_c, R.string.thirty_d, R.string.thirty_ans, R.string.thirty_d ),

               new Word(R.string.thirty1, R.string.thirty1_a, R.string.thirty1_b, R.string.thirty1_c, R.string.thirty1_d, R.string.thirty1_ans, R.string.thirty1_b ),
               new Word(R.string.thirty2, R.string.thirty2_a, R.string.thirty2_b, R.string.thirty2_c, R.string.thirty2_d, R.string.thirty2_ans, R.string.thirty2_d ),
               new Word(R.string.thirty3, R.string.thirty3_a, R.string.thirty3_b, R.string.thirty3_c, R.string.thirty3_d, R.string.thirty3_ans, R.string.thirty3_c ),
               new Word(R.string.thirty4, R.string.thirty4_a, R.string.thirty4_b, R.string.thirty4_c, R.string.thirty4_d, R.string.thirty4_ans, R.string.thirty4_b ),
               new Word(R.string.thirty5, R.string.thirty5_a, R.string.thirty5_b, R.string.thirty5_c, R.string.thirty5_d, R.string.thirty5_ans, R.string.thirty5_c ),
               new Word(R.string.thirty6, R.string.thirty6_a, R.string.thirty6_b, R.string.thirty6_c, R.string.thirty6_d, R.string.thirty6_ans, R.string.thirty6_a ),
               new Word(R.string.thirty7, R.string.thirty7_a, R.string.thirty7_b, R.string.thirty7_c, R.string.thirty7_d, R.string.thirty7_ans, R.string.thirty7_d ),
               new Word(R.string.thirty8, R.string.thirty8_a, R.string.thirty8_b, R.string.thirty8_c, R.string.thirty8_d, R.string.thirty8_ans, R.string.thirty8_b ),
               new Word(R.string.thirty9, R.string.thirty9_a, R.string.thirty9_b, R.string.thirty9_c, R.string.thirty9_d, R.string.thirty9_ans, R.string.thirty9_d ),
               new Word(R.string.fourty, R.string.fourty_a, R.string.fourty_b, R.string.fourty_c, R.string.fourty_d, R.string.fourty_ans, R.string.fourty_c )
       ));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        // call the method test
        test();
    }

    public void test(){

    }
}
