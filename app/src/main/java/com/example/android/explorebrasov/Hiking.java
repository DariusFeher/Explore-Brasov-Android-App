package com.example.android.explorebrasov;


public class Hiking {

    private String hikingTitle;
    private String duration;
    private String difficulty;
    private String mountainsName;
    private String seasonality;
    private int hikingImgId;


    public Hiking(String hikingTitleIn, String durationIn, String difficultyIn, String mountainsNameIn, String seasonalityIn, int hikingImgIdIn) {
        hikingTitle = hikingTitleIn;
        duration = durationIn;
        difficulty = difficultyIn;
        mountainsName = mountainsNameIn;
        seasonality = seasonalityIn;
        hikingImgId = hikingImgIdIn;
    }

    public int getHikingImgId() {
        return hikingImgId;
    }

    public String getHikingTitle() {
        return hikingTitle;
    }

    public String getDuration() {
        return duration;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getMountainsName() {
        return mountainsName;
    }

    public String getSeasonality() {
        return seasonality;
    }
}