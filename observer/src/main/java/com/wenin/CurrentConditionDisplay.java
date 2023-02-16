package com.wenin;

/**
 * @since : 2023/2/16
 */
public class CurrentConditionDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;

    @Override
    public void display() {
        System.out.println("CurrentConditionDisplay:{" + "temperature: " + temperature + ", humidity: " + humidity + "}");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
