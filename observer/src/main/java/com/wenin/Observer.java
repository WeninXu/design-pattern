package com.wenin;

/**
 * @since : 2023/2/16
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
