package com.yellowelcome.models;

public class Restaurant {
    private String name;
    private String cuisine;
    private String location;

    public Restaurant(String name, String cuisine, String location) {
        this.name = name;
        this.cuisine = cuisine;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Restaurant: " + name + " | Cuisine: " + cuisine + " | Location: " + location;
    }
}
