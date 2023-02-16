package com.wenin.condiment;

import com.wenin.beverage.Beverage;

/**
 * @since : 2023/2/15
 */
public class MilkBubble extends CondimentDecorator {

    private final Beverage beverage;

    public MilkBubble(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", MilkBubble";
    }
}
