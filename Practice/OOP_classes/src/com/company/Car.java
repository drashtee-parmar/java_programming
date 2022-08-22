package com.company;

public class Car {
    //creating a fields - characteristics or state components for class
    // State components of car

    private int doors;
    private int wheels;
    private String model; // its a field
    private String engine;
    private String Color;

    // creating an objects from this class

    // creating public method to update model
    //updating model using parameter instead of accessing it directly
    public void setModels(String model) { // String model - it is parameter
        // validation
        String validModel = model.toLowerCase();
        if (validModel.equals("Carrera") || validModel.equals("commodore")) { // .equal() test that the particular value of String is equal to another type.
            this.model = model; // here the first section this.model-is a field and = model is coming from parameter
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

}
