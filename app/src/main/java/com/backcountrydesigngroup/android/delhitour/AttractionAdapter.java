package com.backcountrydesigngroup.android.delhitour;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {


    public AttractionAdapter(Activity context, ArrayList<Attraction> arrayListAttractions) {
        super(context, 0, arrayListAttractions);
        }

    //The below comes from:  https://github.com/udacity/ud839_CustomAdapter_Example/blob/master/app/src/main/java/com/example/android/flavor/AndroidFlavorAdapter.java
    //With modifications.  Per the license agreement, the original copyright and license notice is posted below.

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
     */

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        // Get and set the attraction name
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currentAttraction.getTitle());

        // Get and set the location
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text);
        locationTextView.setText(currentAttraction.getLocation());

        //Get and set the hours
        TextView hoursTextView = (TextView) listItemView.findViewById(R.id.hours_text);
        hoursTextView.setText(currentAttraction.getHours());

        //Get and set the phone number
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.contact_number_text);
        phoneTextView.setText(currentAttraction.getPhoneNumber());

        //Get and set the description
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text);
        descriptionTextView.setText(currentAttraction.getDescription());

        // Get and set the image
        ImageView img = (ImageView) listItemView.findViewById(R.id.image);
        if(currentAttraction.getImageID() != 0) {
            img.setVisibility(View.VISIBLE);
            img.setImageResource(currentAttraction.getImageID());
        } else {
            img.setImageResource(R.drawable.ic_launcher_foreground);
        }

        return listItemView;
    }
}
