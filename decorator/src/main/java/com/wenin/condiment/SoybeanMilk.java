package com.wenin.condiment;

import com.wenin.beverage.Beverage;

/**
 * @since : 2023/2/15
 */
public class SoybeanMilk extends CondimentDecorator {
    private final Beverage beverage;

    public SoybeanMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", SoyBeanMilk";
    }
}
