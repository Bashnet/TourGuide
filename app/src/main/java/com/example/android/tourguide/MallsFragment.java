package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MallsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        /**
         * This creates the list using the custom guide class
         */

        ArrayList<guide> mallsGuide = new ArrayList<>();

        mallsGuide.add(new guide(R.string.ceddi_plaza_heading, R.string.ceddi_plaza_description, R.drawable.ceddi));
        mallsGuide.add(new guide(R.string.silverbird_entertainment_center_heading, R.string.silverbird_entertainment_center_description, R.drawable.silverbird));
        mallsGuide.add(new guide(R.string.the_capital_hub_heading, R.string.the_capital_hub_description, R.drawable.capital_hub));

        /**
         * this assigns the list to a custom giudeAdapter ans initializes it to a listView
         */

        GuideAdapter adapter = new GuideAdapter(getActivity(), mallsGuide);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
