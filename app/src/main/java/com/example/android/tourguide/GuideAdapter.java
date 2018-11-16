package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GuideAdapter extends ArrayAdapter<guide> {

    public GuideAdapter(Activity context, ArrayList<guide> guides) {
        super(context, 0, guides);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.guide_item, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
        guide currentguide = getItem(position);

        //Find the TextView with the name of the location
        TextView placeName = (TextView) listItemView.findViewById(R.id.place_name);
        //set this text on it
        placeName.setText(currentguide.getPlaceName());

        //Find the TextView with the address of the location
        TextView placeLocation = (TextView) listItemView.findViewById(R.id.place_location);
        //set this text on it
        placeLocation.setText(currentguide.getPlaceDescription());

        //Find the image resource id
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.guide_image);
        imageView.setImageResource(currentguide.getImageResourceId());

        return listItemView;

    }
}


