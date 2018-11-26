package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.ViewPagerFragment_Single_Product;

/**
 * Created by wolfsoft4 on 14/8/18.
 */

public class ViewpagerAdapter_Single_Product extends FragmentStatePagerAdapter {
    public ViewpagerAdapter_Single_Product(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ViewPagerFragment_Single_Product tab1=new ViewPagerFragment_Single_Product();
                return tab1;
            case 1:
                ViewPagerFragment_Single_Product tab2=new ViewPagerFragment_Single_Product();
                return tab2;
            case 2:
                ViewPagerFragment_Single_Product tab3=new ViewPagerFragment_Single_Product();
                return tab3;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
