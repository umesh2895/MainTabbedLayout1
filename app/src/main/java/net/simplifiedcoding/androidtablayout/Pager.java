package net.simplifiedcoding.androidtablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

//Extending FragmentStatePagerAdapter
public class Pager extends FragmentStatePagerAdapter  {

    //integer to count number of tabs
    int tabCount;
    private String[] tabTitles = new String[]{"Tab1", "Tab2", "Tab3", "TabProfileFragment"};
    //Constructor to the class
    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }


    // overriding getPageTitle()

    /* you can add name to tab instead only icon i.e. text with icon
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
    */


    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;
            case 1:
                Tab2 tab2 = new Tab2();
                return tab2;
            case 2:
                Tab3 tab3 = new Tab3();
                return tab3;
            case 3:
                TabProfileFragment tabProfileFragment = new TabProfileFragment();
                return tabProfileFragment;
            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}