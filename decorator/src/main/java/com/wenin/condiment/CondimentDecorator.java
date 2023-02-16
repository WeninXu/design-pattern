package com.wenin.condiment;

import com.wenin.beverage.Beverage;

/**
 * @since : 2023/2/15
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
