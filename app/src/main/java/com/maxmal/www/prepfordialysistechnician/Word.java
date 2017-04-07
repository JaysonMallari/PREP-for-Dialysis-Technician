package com.maxmal.www.prepfordialysistechnician;

/**
 * Created by My__Boo on 4/3/2017.
 */

public class Word {

    /** initial letter */
    private String mInitialLetter;

    /** main word */
    private int mMainWord;

    /** meaning resource id */
    private int mMeaningResourceId;

    private int mColorResourceId;



    /** constructor */
    public Word(String initialLetter, int mainWord, int meaningResourceId, int colorResourceId){
        mInitialLetter = initialLetter;
        mMainWord = mainWord;
        mMeaningResourceId = meaningResourceId;
        mColorResourceId = colorResourceId;
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

}
