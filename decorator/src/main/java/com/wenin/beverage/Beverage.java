package com.wenin.beverage;

/**
 * @since : 2023/2/15
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
