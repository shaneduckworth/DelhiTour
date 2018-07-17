package com.backcountrydesigngroup.android.delhitour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Initialize "Sites" array
        final ArrayList<Attraction> sites = new ArrayList<Attraction>();
        // http://www.smyleinn.com/images/ph.jpg
        sites.add(new Attraction(getString(R.string.hotels1_name),getString(R.string.hotels1_location), getString(R.string.hotels1_hours), getString(R.string.hotels1_phn_num), getString(R.string.hotels1_desc), R.drawable.smyle_inn));
        // https://www.theleela.com/contentAsset/image/f08481e3-5ed6-4f86-9b1d-ccf9f11ec56d/fileAsset/h/300
        sites.add(new Attraction(getString(R.string.hotels2_name),getString(R.string.hotels2_location), getString(R.string.hotels2_hours), getString(R.string.hotels2_phn_num), getString(R.string.hotels2_desc), R.drawable.leela));
        // https://res.cloudinary.com/simplotel/image/upload/x_0,y_253,w_940,h_419,r_0,c_crop,q_90/w_355,h_200,f_auto,c_fit/golden-tulip-essential-%E2%80%93-west-delhi-hotel/Golden_Tulip_Essential_West_Delhi_Hotel_Logo_isxssz
        sites.add(new Attraction(getString(R.string.hotels3_name),getString(R.string.hotels3_location), getString(R.string.hotels3_hours), getString(R.string.hotels3_phn_num), getString(R.string.hotels3_desc), R.drawable.golden_tulip));
        // http://jugaadhostels.com/wp-content/uploads/2018/04/jugaad_new-logo-.png
        sites.add(new Attraction(getString(R.string.hotels4_name),getString(R.string.hotels4_location), getString(R.string.hotels4_hours), getString(R.string.hotels4_phn_num), getString(R.string.hotels4_desc), R.drawable.jugaad));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), sites);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
