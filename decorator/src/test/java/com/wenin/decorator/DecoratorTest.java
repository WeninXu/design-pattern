package com.wenin.decorator;

import com.wenin.beverage.Beverage;
import com.wenin.beverage.Espresso;
import com.wenin.condiment.Milk;
import com.wenin.condiment.MilkBubble;
import com.wenin.condiment.Mocha;
import org.junit.Test;

/**
 * @since : 2023/2/15
 */
public class DecoratorTest {

    @Test
    public void makeEspresso() {
        Beverage espresso = new Espresso();
        espresso = new Milk(espresso);
        espresso = new MilkBubble(espresso);
        espresso = new Mocha(espresso);
        System.out.println("cost:" + espresso.cost());
        System.out.println("description:" + espresso.getDescription());
    }
}
