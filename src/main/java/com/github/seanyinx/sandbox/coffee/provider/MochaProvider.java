package com.github.seanyinx.sandbox.coffee.provider;

import static com.github.seanyinx.sandbox.coffee.maker.CoffeeType.MOCHA;

import com.github.seanyinx.sandbox.coffee.maker.Pourable;

/**
 * @author Mike.Shen
 * @date 2020/12/12
 **/
public class MochaProvider implements CoffeeProvider {

    @Override
    public void pouringPowder(Pourable pourable) {
        pourable.pour(MOCHA.name());
    }
    
}
