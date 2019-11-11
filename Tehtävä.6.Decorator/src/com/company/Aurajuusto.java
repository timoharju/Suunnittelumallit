package com.company;

public class Aurajuusto extends PizzanTäyttäjä {

    public Aurajuusto(Pizza pizza) {
        super(pizza);

    }

    @Override
    public String pizzanTäytteet() {
        return pizza.pizzanTäytteet() + ", Aurajuusto";
    }

    public double getHinta() {
        return pizza.getHinta() + 1.00;
    }

}