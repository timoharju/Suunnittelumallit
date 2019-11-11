package com.company;

public class Mozzarella extends PizzanTäyttäjä {

    public Mozzarella(Pizza pizza) {
        super(pizza);

    }

    @Override
    public String pizzanTäytteet() {
        return pizza.pizzanTäytteet() + ", Mozzarella";
    }

    public double getHinta() {
        return pizza.getHinta() + 1.00;
    }

}

