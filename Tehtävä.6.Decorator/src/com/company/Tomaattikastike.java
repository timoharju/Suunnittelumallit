package com.company;

public class Tomaattikastike extends PizzanTäyttäjä {

    public Tomaattikastike(Pizza pizza) {
        super(pizza);

    }

    public String pizzanTäytteet() {
        return pizza.pizzanTäytteet() + ", Tomaattikastike";
    }

    public double getHinta() {
        return pizza.getHinta() + 1.00;
    }

}
