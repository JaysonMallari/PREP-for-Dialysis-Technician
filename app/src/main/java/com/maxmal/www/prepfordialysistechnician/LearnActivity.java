package com.maxmal.www.prepfordialysistechnician;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LearnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        // find the view pager that will allow user to swipe between fragments.
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

        // Create an adapter which knows which page should be shown on each page
        CategoryAdapter categoryAdapter = new CategoryAdapter(this,getSupportFragmentManager());

        //setup the the viewpager with the customize adapter
        viewPager.setAdapter(categoryAdapter);

        // find the tablout to w/c will diaply the tab label for each fragment
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);


    }
}
