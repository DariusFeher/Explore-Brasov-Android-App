package com.example.android.explorebrasov;

public class Location {

    private String restaurantName;
    private String phoneNumber;
    private String address;
    private float ratingNr;

    public Location(String restaurantNameIn, String phoneNumberIn, String addressIn, float ratingNrIn) {
        restaurantName = restaurantNameIn;
        phoneNumber = phoneNumberIn;
        address = addressIn;
        ratingNr = ratingNrIn;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public float getRatingNr() {
        return ratingNr;
    }
}
