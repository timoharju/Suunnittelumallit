package com.company;

public class Ananas extends PizzanTäyttäjä {

    public Ananas(Pizza pizza) {
        super(pizza);

    }

    @Override
    public String pizzanTäytteet() {
        return pizza.pizzanTäytteet() + ", Ananas";
    }

    public double getHinta() {
        return pizza.getHinta() + 1.00;
    }

}
