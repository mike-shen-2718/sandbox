package com.github.seanyinx.sandbox.coffee.provider;

import static com.github.seanyinx.sandbox.coffee.maker.CoffeeType.LATTE;

import com.github.seanyinx.sandbox.coffee.maker.Pourable;

/**
 * @author Mike.Shen
 * @date 2020/12/12
 **/
public class LatteProvider implements CoffeeProvider {

    @Override
    public void pouringPowder(Pourable pourable) {
        pourable.pour(LATTE.name());
    }

}
