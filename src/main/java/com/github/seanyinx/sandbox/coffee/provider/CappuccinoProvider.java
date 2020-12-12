package com.github.seanyinx.sandbox.coffee.provider;

import static com.github.seanyinx.sandbox.coffee.maker.CoffeeType.CAPPUCCINO;

import com.github.seanyinx.sandbox.coffee.maker.Pourable;

/**
 * @author Mike.Shen
 * @date 2020/12/12
 **/
public class CappuccinoProvider implements CoffeeProvider {

    @Override
    public void pouringPowder(Pourable pourable) {
        pourable.pour(CAPPUCCINO.name());
    }

}
