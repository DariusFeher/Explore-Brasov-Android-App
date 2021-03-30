package com.example.android.explorebrasov;

public class Attraction {

    private int attractionId;
    private String attractionName;
    private float ratingNr;
    private String link;

    public Attraction(int attractionIdIn, String attractionNameIn, float ratingNrIn, String linkIn) {
        attractionId = attractionIdIn;
        attractionName = attractionNameIn;
        ratingNr = ratingNrIn;
        link = linkIn;
    }

    public int getAttractionId() {
        return attractionId;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public float getRatingNr() {
        return ratingNr;
    }

    public String getLink() {
        return link;
    }
}
