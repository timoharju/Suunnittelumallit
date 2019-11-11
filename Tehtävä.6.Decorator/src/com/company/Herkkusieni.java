package com.company;

public class Herkkusieni extends PizzanTäyttäjä {

    public Herkkusieni(Pizza pizza) {
        super(pizza);

    }

    public String pizzanTäytteet() {
        return pizza.pizzanTäytteet() + ", Herkkusieni";
    }

    public double getHinta() {
        return pizza.getHinta() + 1.00;
    }

}

