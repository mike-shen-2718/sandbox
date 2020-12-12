package com.github.seanyinx.sandbox.coffee.provider;

import static com.github.seanyinx.sandbox.coffee.maker.CoffeeType.BLACK;

import com.github.seanyinx.sandbox.coffee.maker.Pourable;

/**
 * @author Mike.Shen
 * @date 2020/12/12
 **/
public class BlackProvider implements CoffeeProvider {

    @Override
    public void pouringPowder(Pourable pourable) {
        pourable.pour(BLACK.name());
    }
    
}
