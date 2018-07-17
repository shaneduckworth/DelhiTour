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
public class GettingThereFragment extends Fragment {


    public GettingThereFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Initialize "Sites" array
        final ArrayList<Attraction> sites = new ArrayList<Attraction>();
        // http://indianrailways.gov.in/images/logo.gif
        sites.add(new Attraction(getString(R.string.getting1_name),getString(R.string.getting1_location), getString(R.string.getting1_hours), getString(R.string.getting1_phn_num), getString(R.string.getting1_desc), R.drawable.indianrailways));
        sites.add(new Attraction(getString(R.string.getting2_name),getString(R.string.getting2_location), getString(R.string.getting2_hours), getString(R.string.getting2_phn_num), getString(R.string.getting2_desc), R.drawable.rickshaw));
        // https://www.redbus.in/i/8257c4f52be028cb6a7a23e1937ab09d.png
        sites.add(new Attraction(getString(R.string.getting3_name),getString(R.string.getting3_location), getString(R.string.getting3_hours), getString(R.string.getting3_phn_num), getString(R.string.getting3_desc), R.drawable.redbus_color));
        // https://www.jetairways.com/Images/jetairways-25-main-web-logo.png
        sites.add(new Attraction(getString(R.string.getting4_name),getString(R.string.getting4_location), getString(R.string.getting4_hours), getString(R.string.getting4_phn_num), getString(R.string.getting4_desc), R.drawable.jetairways));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), sites);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
