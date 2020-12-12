package com.github.seanyinx.sandbox.coffee.maker;

import com.github.seanyinx.sandbox.coffee.provider.CoffeeProvider;

public class CoffeeMaker {

    public static String WATER = "Water";

    public void makeCoffee(Pourable pourable, CoffeeProvider coffeeProvider) {
        coffeeProvider.pouringPowder(pourable);
        pouringBoilingWater(pourable);
    }

    private void pouringBoilingWater(Pourable pourable) {
        pourable.pour(WATER);
    }

}
