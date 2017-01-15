package com.yllun.zero.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by zero on 14.01.17.
 */

public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
