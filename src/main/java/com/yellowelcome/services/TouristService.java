package com.yellowelcome.services;

import com.yellowelcome.models.Town;
import com.yellowelcome.models.Restaurant;
import com.yellowelcome.models.Place;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TouristService {

    // List of towns
    public List<Town> getTowns() {
        List<Town> towns = new ArrayList<>();
        towns.add(new Town("Paris", "A beautiful city known for its art, fashion, and culture", 25.5));
        towns.add(new Town("St. Jacobs Village", "Famous for its farmers' market", 50.3));
        towns.add(new Town("Collingwood", "Known for skiing and stunning views", 100.2));
        towns.add(new Town("Picton", "Quaint town with wineries and arts", 75.8));
        towns.add(new Town("Unionville", "A historic town with a vibrant main street", 30.1));
        towns.add(new Town("Port Perry", "Popular for outdoor activities and fishing", 85.4));
        towns.add(new Town("Bracebridge", "Great for outdoor adventures and water sports", 200.2));
        towns.add(new Town("Creemore", "A small town with a rich brewery culture", 110.3));
        towns.add(new Town("Port Hope", "A charming town on the banks of Lake Ontario", 60.2));
        towns.add(new Town("Elora", "Known for its beautiful gorge and historic architecture", 90.4));
        return towns;
    }

    // List of restaurants
    public List<Restaurant> getRestaurants() {
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Black + Blue", "Canadian", "Toronto"));
        restaurants.add(new Restaurant("Uk India Bistro", "Continental", "Toronto"));
        restaurants.add(new Restaurant("Casa Madera", "Italian", "Toronto"));
        restaurants.add(new Restaurant("Harriet's Rooftop", "Canadian", "Toronto"));
        restaurants.add(new Restaurant("1 Kitchen", "Intercontinental", "Toronto"));
        restaurants.add(new Restaurant("New Orleans Seafood & Steakhouse", "Canadian", "Toronto"));
        restaurants.add(new Restaurant("Silent H", "European", "Toronto"));
        restaurants.add(new Restaurant("Jacobs & Co. Steakhouse", "Canadian", "Toronto"));
        restaurants.add(new Restaurant("Pai Northern Thai Kitchen", "Asian", "Toronto"));
        restaurants.add(new Restaurant("The Restaurant at the CN Tower", "Canadian", "Toronto"));
        return restaurants;
    }

    // List of places
    public List<Place> getPlaces() {
        List<Place> places = new ArrayList<>();
        places.add(new Place("The Distillery District", "Historic Area", 45.00));
        places.add(new Place("High Park", "Park", 70.00));
        places.add(new Place("Toronto Islands", "Island", 60.00));
        places.add(new Place("Scarborough Bluffs", "Scenic View", 100.00));
        places.add(new Place("Royal Ontario Museum", "Museum", 35.00));
        places.add(new Place("Casa Loma", "Historic Site", 105.00));
        places.add(new Place("Nathan Phillips Square", "Public Square", 80.00));
        places.add(new Place("St. Lawrence Market", "Market", 60.00));
        places.add(new Place("The Waterfront", "Waterfront", 95.00));
        places.add(new Place("Art Gallery of Ontario", "Gallery", 50.00));
        return places;
    }
}
