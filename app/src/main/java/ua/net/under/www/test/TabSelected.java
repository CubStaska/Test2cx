package ua.net.under.www.test;

import android.support.design.widget.TabLayout;

public class TabSelected implements TabLayout.OnTabSelectedListener {
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        Log.print(String.valueOf(tab.getPosition()));
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
