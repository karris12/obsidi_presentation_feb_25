package com.yellowelcome.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * Model class to validate user input.
 */
public class UserInput {

    @NotBlank(message = "Input cannot be empty")
    @Size(min = 1, max = 20, message = "Input must be between 1 and 20 characters")
    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
