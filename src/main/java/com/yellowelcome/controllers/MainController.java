package com.yellowelcome.controllers;

import com.yellowelcome.services.TouristService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * MainController handles user requests and returns views.
 */
@Controller
public class MainController {

    private final TouristService touristService;

    // Constructor-based dependency injection for the service class
    public MainController(TouristService touristService) {
        this.touristService = touristService;
    }

    /**
     * Display the home menu.
     */
    @GetMapping("/")
    public String showMenu() {
        return "menu"; // menu.html (Thymeleaf template)
    }

    /**
     * Display the list of beautiful towns.
     */
    @GetMapping("/towns")
    public String showTowns(Model model) {
        model.addAttribute("towns", touristService.getTowns());
        return "towns"; // towns.html (Thymeleaf template)
    }

    /**
     * Display the list of most visited restaurants.
     */
    @GetMapping("/restaurants")
    public String showRestaurants(Model model) {
        model.addAttribute("restaurants", touristService.getRestaurants());
        return "restaurants"; // restaurants.html (Thymeleaf template)
    }

    /**
     * Display the list of interesting places.
     */
    @GetMapping("/places")
    public String showPlaces(Model model) {
        model.addAttribute("places", touristService.getPlaces());
        return "places"; // places.html (Thymeleaf template)
    }
}
