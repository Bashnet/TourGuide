package com.example.android.tourguide;

public class guide {
    private int mPlaceName;
    private int mPlaceDescription;
    private int mImageResourceId;

    public guide(int placeName, int placeDescription, int imageResourceId) {
        mPlaceName = placeName;
        mPlaceDescription = placeDescription;
        mImageResourceId = imageResourceId;
    }

    public int getPlaceName() {
        return mPlaceName;
    }

    public int getPlaceDescription() {
        return mPlaceDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


}
