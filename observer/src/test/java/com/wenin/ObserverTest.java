package com.wenin;

import org.junit.Test;

/**
 * @since : 2023/2/16
 */
public class ObserverTest {

    @Test
    public void observer() {
        WeatherData subject = new WeatherData();
        subject.registerObserver(new CurrentConditionDisplay());
        subject.setMeasurements(1.0f, 2.0f, 3.0f);
        subject.setMeasurements(15.0f, 23.0f, 3.0f);
        subject.setMeasurements(100.0f, 22.0f, 333.0f);
    }
}
