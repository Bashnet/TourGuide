package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LandMarksFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        /**
         * This creates the list using the custom guide class
         */

        final ArrayList<guide> landmarkGuide = new ArrayList<>();

        landmarkGuide.add(new guide(R.string.zuma_rock_heading, R.string.zuma_rock_description, R.drawable.zuma_rock));
        landmarkGuide.add(new guide(R.string.aso_rock_heading, R.string.aso_rock_description, R.drawable.aso_rock));
        landmarkGuide.add(new guide(R.string.millenium_park_heading, R.string.milennium_park_description, R.drawable.millennium_park_abuja));
        landmarkGuide.add(new guide(R.string.abuja_national_mosque_heading, R.string.abuja_national_mosque_description, R.drawable.abuja_national_mosque));

        /**
         * this assigns the list to a custom giudeAdapter ans initializes it to a listView
         */

        GuideAdapter adapter = new GuideAdapter(getActivity(), landmarkGuide);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}

