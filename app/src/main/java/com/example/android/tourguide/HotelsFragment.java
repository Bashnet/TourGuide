package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        /**
         * This creates the list using the custom guide class
         */

        ArrayList<guide> hotelsGuide = new ArrayList<>();

        hotelsGuide.add(new guide(R.string.transcorp_hilton_heading, R.string.transcorp_hilton_description, R.drawable.transcorp_hilton));
        hotelsGuide.add(new guide(R.string.fraser_suites_heading, R.string.fraser_suites_description, R.drawable.fraser_suites));
        hotelsGuide.add(new guide(R.string.bon_hotel_heading, R.string.bon_hotel_description, R.drawable.bon_hotel));
        hotelsGuide.add(new guide(R.string.sheraton_hotel_heading, R.string.sheraton_hotel_description, R.drawable.sheraton_abuja));

        /**
         * this assigns the list to a custom giudeAdapter ans initializes it to a listView
         */

        GuideAdapter adapter = new GuideAdapter(getActivity(), hotelsGuide);

        ListView listview = rootView.findViewById(R.id.list);

        listview.setAdapter(adapter);

        return rootView;
    }
}
