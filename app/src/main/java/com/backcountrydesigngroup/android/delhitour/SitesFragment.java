package com.backcountrydesigngroup.android.delhitour;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SitesFragment extends Fragment {


    public SitesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Initialize "Sites" array
        final ArrayList<Attraction> sites = new ArrayList<Attraction>();
        // By A.Savin (Wikimedia Commons · WikiPhotoSpace) - Own work, FAL, https://commons.wikimedia.org/w/index.php?curid=48745873
        sites.add(new Attraction(getString(R.string.site1_name),getString(R.string.site1_location), getString(R.string.site1_hours), getString(R.string.site1_phn_num), getString(R.string.site1_desc), R.drawable.redfort));
        // By Anupamg - Own work, CC BY-SA 3.0, https://commons.wikimedia.org/w/index.php?curid=21147633
        sites.add(new Attraction(getString(R.string.site2_name),getString(R.string.site2_location), getString(R.string.site2_hours), getString(R.string.site2_phn_num), getString(R.string.site2_desc), R.drawable.qutub));
        https://commons.wikimedia.org/wiki/File:Humayun_Tomb,_Delhi,_running_fountain.jpg#/media/File:Humayun_Tomb,_Delhi,_running_fountain.jpg
        sites.add(new Attraction(getString(R.string.site3_name),getString(R.string.site3_location), getString(R.string.site3_hours), getString(R.string.site3_phn_num), getString(R.string.site3_desc), R.drawable.humayan));
        // By Vu2sga - Own work, CC BY-SA 3.0, https://commons.wikimedia.org/w/index.php?curid=21778789
        sites.add(new Attraction(getString(R.string.site4_name),getString(R.string.site4_location), getString(R.string.site4_hours), getString(R.string.site4_phn_num), getString(R.string.site4_desc), R.drawable.feroz));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), sites);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }

}
