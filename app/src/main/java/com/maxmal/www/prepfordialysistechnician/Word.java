package com.maxmal.www.prepfordialysistechnician;

import static android.icu.text.Normalizer.NO;

/**
 * Created by My__Boo on 4/3/2017.
 */

public class Word {



    /** main word */
    private int mMainWord;

    /** meaning resource id */
    private int mMeaningResourceId;


    /** initialize the value for no image */
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Image resource ID for the word*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** initialize the value for no text*/
    private static  final String NO_STRING_PROVIDED = "";

    /** initial letter initialize with empty string*/
    private String mInitialLetter = NO_STRING_PROVIDED;

    /** color resourceID*/
    private int mColorResourceId ;


    /** constructor for pct activity */
    public Word(int imageResourceId, int mainWord, int meaningResourceId){
        mImageResourceId = imageResourceId;
        mMainWord = mainWord;
        mMeaningResourceId = meaningResourceId;
    }



    /** constructor */
    public Word(String initialLetter, int mainWord, int meaningResourceId, int colorResourceId){
        mInitialLetter = initialLetter;
        mMainWord = mainWord;
        mMeaningResourceId = meaningResourceId;
        mColorResourceId = colorResourceId;
    }

    /**
     * get the imgaeResource id
     */
     public int getmImageResourceId(){
         return mImageResourceId;
     }

    /**
     * get the inital letter
     */
    public String getmInitialLetter(){
        return mInitialLetter;
    }

    /**
     *  get the main word
     */
    public int getmMainWord(){
        return mMainWord;
    }

    /**
     * get the meaning resource id
     * @return
     */
    public int getmMeaningResourceId(){
        return mMeaningResourceId;
    }

    /**
     * get the color resource id
     */
    public  int getmColorResourceId(){
        return mColorResourceId;
    }


    /** Variables for the test activity*/
    private int mQuestion;
    private int mChoiceA;
    private int mChoiceB;
    private int mChoiceC;
    private int mChoiceD;
    private int mDescription;
    private int mAnswer;

    /** Constructor for test activity*/
    public Word(int question, int choiceA, int choiceB, int choiceC, int choiceD, int description, int answer){
        mQuestion = question;
        mChoiceA = choiceA;
        mChoiceB = choiceB;
        mChoiceC = choiceC;
        mChoiceD = choiceD;
        mDescription = description;
        mAnswer = answer;
    }

    public int getmQuestion(){
        return mQuestion;
    }

    public int getmChoiceA(){
        return mChoiceA;
    }

    public int getmChoiceB(){
        return mChoiceB;
    }

    public int getmChoiceC(){
        return mChoiceC;
    }

    public int getmChoiceD(){
        return mChoiceD;
    }

    public int getmDescription(){
        return mDescription;
    }

    public int getmAnswer(){
        return mAnswer;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasString(){
        return mInitialLetter != NO_STRING_PROVIDED;
    }

}
