package com.company;

public class Kinkku extends PizzanTäyttäjä {
    public Kinkku(Pizza pizza) {
        super(pizza);

    }

    public String pizzanTäytteet() {
        return pizza.pizzanTäytteet() + ", Kinkku";
    }

    public double getHinta() {
        return pizza.getHinta() + 1.00;
    }

}


