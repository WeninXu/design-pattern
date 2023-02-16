package com.wenin;

/**
 * @since : 2023/2/16
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
