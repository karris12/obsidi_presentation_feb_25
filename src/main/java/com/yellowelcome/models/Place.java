package com.yellowelcome.models;

public class Place {
    private String name;
    private String category;
    private double taxiFare;

    public Place(String name, String category, double taxiFare) {
        this.name = name;
        this.category = category;
        this.taxiFare = taxiFare;
    }

    @Override
    public String toString() {
        return "Place: " + name + " | Category: " + category + " | Taxi Fare: $" + taxiFare;
    }
}
