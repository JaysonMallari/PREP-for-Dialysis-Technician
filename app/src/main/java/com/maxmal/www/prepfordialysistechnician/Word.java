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

}
