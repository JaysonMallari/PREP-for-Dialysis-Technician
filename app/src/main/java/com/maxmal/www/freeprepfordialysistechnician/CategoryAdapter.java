package com.maxmal.www.freeprepfordialysistechnician;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by My__Boo on 4/1/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new AcronymsFragment();
        }else if(position == 1){
            return new ConvertionsFragment();
        }else if(position == 2){
            return new OrganizationFragment();
        }else{
            return  new VocabulariesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
       /* if (position == 0){
           return mContext.getString(R.string.category_acronyms);
        }else if (position == 1){
            return mContext.getString(R.string.category_conversions);
        }else if (position == 2){
            return mContext.getString(R.string.category_organiztions);
        }else {
            return mContext.getString(R.string.category_vocabulary);
        }*/
       return null;
    }
}
