package com.yellowelcome.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class TouristServiceTest {

    private final TouristService touristService = new TouristService();

    @Test
    public void testGetTowns() {
        List<String> towns = touristService.getTowns();
        assertEquals(10, towns.size(), "The list should contain 10 towns.");
    }

    @Test
    public void testGetRestaurants() {
        List<String> restaurants = touristService.getRestaurants();
        assertEquals(10, restaurants.size(), "The list should contain 10 restaurants.");
    }

    @Test
    public void testGetPlaces() {
        List<String> places = touristService.getPlaces();
        assertEquals(10, places.size(), "The list should contain 10 places.");
    }
}
