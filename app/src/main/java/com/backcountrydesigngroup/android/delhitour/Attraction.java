package com.backcountrydesigngroup.android.delhitour;

public class Attraction {

    // String value - name or title of attraction
    private String mTitle;

    // String value - location
    private String mLocation;

    // String value - hours
    private String mHours;

    // String value - contact number
    private String mNumber;

    // String value - description
    private String mDescription;

    // int value image ID
    private int mImg;

    /**
     * Construct the attraction object
     */
    public Attraction(String title, String location, String hours, String phoneNumber, String description, int imageID) {
        mTitle = title;
        mLocation = location;
        mHours = hours;
        mNumber = phoneNumber;
        mDescription = description;
        mImg = imageID;
    }

    /**
     * setter method for setting new information if needed
     */
    public void setAttraction(String title, String location, String hours, String phoneNumber, String description, int imageID) {
        mTitle = title;
        mLocation = location;
        mHours = hours;
        mNumber = phoneNumber;
        mDescription = description;
        mImg = imageID;
    }

    /**
     * getter method for the title
     *
     * @return title
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * getter method for the location
     *
     * @return location
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * getter method for the hours of operation
     *
     * @return hours
     */
    public String getHours() {
        return mHours;
    }

    /**
     * getter method for the phone number
     *
     * @return phone number
     */
    public String getPhoneNumber() {
        return mNumber;
    }

    /**
     * getter method for the description
     *
     * @return description
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * getter method for the image ID
     *
     * @return image ID
     */
    public int getImageID() {
        return mImg;
    }

}
