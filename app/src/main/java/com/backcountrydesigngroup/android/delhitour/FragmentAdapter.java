package com.backcountrydesigngroup.android.delhitour;

// Some of the below comes from:  https://github.com/udacity/ud839_CustomAdapter_Example/blob/master/app/src/main/java/com/example/android/flavor/AndroidFlavorAdapter.java
// With modifications.  Per the license agreement, the original copyright and license notice is posted below.

/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Please note there have been modifications to the original source code, which can be found here:
 * https://github.com/udacity/ud839_ViewPager_Example/tree/quiz
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    private String tabText[] = new String[] {"VISIT","SLEEP","EAT","GET THERE"};

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new SitesFragment();
            case 1:
                return new HotelsFragment();
            case 2:
                return new RestaurantsFragment();
            case 3:
                return new GettingThereFragment();
            default:
                return new SitesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabText[position];
    }
}

