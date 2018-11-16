package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        /**
         * This creates the list using the custom guide class
         */

        final ArrayList<guide> restaurantGuide = new ArrayList<>();

        restaurantGuide.add(new guide(R.string._355_steakhouse_and_lounge_heading, R.string._355_steakhouse_and_lounge_description, R.drawable.steakhouse_355));
        restaurantGuide.add(new guide(R.string.chopsticks_heading, R.string.chopsticks_description, R.drawable.chopsticks));
        restaurantGuide.add(new guide(R.string.chez_victor_heading, R.string.chez_victor_description, R.drawable.chez_victor));
        restaurantGuide.add(new guide(R.string.obudu_grill_house_heading, R.string.obudu_grill_house_description, R.drawable.obudu_grill));

        /**
         * this assigns the list to a custom giudeAdapter ans initializes it to a listView
         */

        GuideAdapter adapter = new GuideAdapter(getActivity(), restaurantGuide);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}
