package com.yellowelcome.models;

public class Town {
    private String name;
    private String description;
    private double distanceFromAirport;

    public Town(String name, String description, double distanceFromAirport) {
        this.name = name;
        this.description = description;
        this.distanceFromAirport = distanceFromAirport;
    }

    @Override
    public String toString() {
        return "Town: " + name + " | Description: " + description + " | Distance from Airport: " + distanceFromAirport + " km";
    }
}
