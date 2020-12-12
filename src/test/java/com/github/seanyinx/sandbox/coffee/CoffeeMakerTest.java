package com.github.seanyinx.sandbox.coffee;

import static com.github.seanyinx.sandbox.coffee.maker.CoffeeType.BLACK;
import static com.github.seanyinx.sandbox.coffee.maker.CoffeeType.CAPPUCCINO;
import static com.github.seanyinx.sandbox.coffee.maker.CoffeeType.ESPRESSO;
import static com.github.seanyinx.sandbox.coffee.maker.CoffeeType.LATTE;
import static com.github.seanyinx.sandbox.coffee.maker.CoffeeType.MOCHA;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

import com.github.seanyinx.sandbox.coffee.maker.CoffeeMaker;
import com.github.seanyinx.sandbox.coffee.maker.Pourable;
import com.github.seanyinx.sandbox.coffee.provider.BlackProvider;
import com.github.seanyinx.sandbox.coffee.provider.CappuccinoProvider;
import com.github.seanyinx.sandbox.coffee.provider.CoffeeProvider;
import com.github.seanyinx.sandbox.coffee.provider.EspressoProvider;
import com.github.seanyinx.sandbox.coffee.provider.LatteProvider;
import com.github.seanyinx.sandbox.coffee.provider.MochaProvider;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class CoffeeMakerTest {

    private final List<String> contents = new ArrayList<>();

    private final Pourable pourable = contents::add;

    private final CoffeeMaker coffeeMaker = new CoffeeMaker();

    private final CoffeeProvider cappuccinoProvider = new CappuccinoProvider();
    private final CoffeeProvider blackProvider = new BlackProvider();
    private final CoffeeProvider mochaProvider = new MochaProvider();
    private final CoffeeProvider latteProvider = new LatteProvider();
    private final CoffeeProvider espressoProvider = new EspressoProvider();

    @Test
    public void makesCappuccino() {
        coffeeMaker.makeCoffee(pourable, cappuccinoProvider);

        assertThat(contents, contains(CAPPUCCINO.name(), CoffeeMaker.WATER));
    }

    @Test
    public void makesBlack() {
        coffeeMaker.makeCoffee(pourable, blackProvider);

        assertThat(contents, contains(BLACK.name(), CoffeeMaker.WATER));
    }

    @Test
    public void makesMocha() {
        coffeeMaker.makeCoffee(pourable, mochaProvider);

        assertThat(contents, contains(MOCHA.name(), CoffeeMaker.WATER));
    }

    @Test
    public void makesLatte() {
        coffeeMaker.makeCoffee(pourable, latteProvider);

        assertThat(contents, contains(LATTE.name(), CoffeeMaker.WATER));
    }

    @Test
    public void makesEspresso() {
        coffeeMaker.makeCoffee(pourable, espressoProvider);

        assertThat(contents, contains(ESPRESSO.name(), CoffeeMaker.WATER));
    }

}
