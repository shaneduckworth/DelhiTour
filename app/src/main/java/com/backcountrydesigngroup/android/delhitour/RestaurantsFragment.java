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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Initialize "Sites" array
        final ArrayList<Attraction> sites = new ArrayList<Attraction>();
        // https://www.google.com/maps/place/Karnataka/@28.5108676,77.202292,3a,75y,90t/data=!3m8!1e2!3m6!1sTbzS8Ku6Gt4AAAQz6AvkRQ!2e0!3e3!6s%2F%2Flh6.googleusercontent.com%2Fproxy%2FrJ5wdB1wnQPAJcreWykrzWVKz90-IcVB7jDCdx7XPdCOCvRsqGcCrtbPNqe6KPDzlKxOTjnLLwCu1Bw_RjLzNKmF0kOz9QeqPFthfnEnVVP9zsTR0uTDhbyN3KUwCkwDjK2EHCggU1XsYXh6E_dB99Te29E%3Dw203-h114-k-no!7i2844!8i1600!4m5!3m4!1s0x390ce1e6eed65391:0x91592865cf1d72ba!8m2!3d28.5109444!4d77.2021219
        sites.add(new Attraction(getString(R.string.restaurants1_name),getString(R.string.restaurants1_location), getString(R.string.restaurants1_hours), getString(R.string.restaurants1_phn_num), getString(R.string.restaurants1_desc), R.drawable.karnataka));
        https://bkpk.me/wp-content/uploads/2013/01/IMG_2866.jpg
        sites.add(new Attraction(getString(R.string.restaurants2_name),getString(R.string.restaurants2_location), getString(R.string.restaurants2_hours), getString(R.string.restaurants2_phn_num), getString(R.string.restaurants2_desc), R.drawable.samosa));
        // http://www.thechaistory.co.in/
        sites.add(new Attraction(getString(R.string.restaurants3_name),getString(R.string.restaurants3_location), getString(R.string.restaurants3_hours), getString(R.string.restaurants3_phn_num), getString(R.string.restaurants3_desc), R.drawable.chaistory));
        // http://im1.dineout.co.in/images/uploads/restaurant/sharpen/3/p/q/p312-14966939905935bce6e1ad6.jpg
        sites.add(new Attraction(getString(R.string.restaurants4_name),getString(R.string.restaurants4_location), getString(R.string.restaurants4_hours), getString(R.string.restaurants4_phn_num), getString(R.string.restaurants4_desc), R.drawable.gardenrestaurant));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), sites);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
