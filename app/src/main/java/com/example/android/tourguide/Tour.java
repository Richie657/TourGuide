package com.example.android.tourguide;

/**
 * Created by Rich on 26/04/2018.
 */

public class Tour {

    private String mPlaceName;

    private String mPlaceDescrip;

    private int mImageResource;

    /**
     * Constant value that represents no image was provided
     */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Tour(String placeName, String placeDescrip, int imageResource) {

        mPlaceName = placeName;
        mPlaceDescrip = placeDescrip;
        mImageResource = imageResource;
    }


    public String getPlaceName() {
        return mPlaceName;
    }

    public String getDescrip() {
        return mPlaceDescrip;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public boolean hasImage() {
        return mImageResource != NO_IMAGE_PROVIDED;
    }

}