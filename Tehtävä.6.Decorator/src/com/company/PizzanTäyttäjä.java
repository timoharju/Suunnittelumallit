package com.company;

public abstract class PizzanTäyttäjä implements Pizza {

    protected Pizza pizza;

    public PizzanTäyttäjä(Pizza uusiPizza) {

        pizza = uusiPizza;

    }

    public String pizzanTäytteet() {
        return pizza.pizzanTäytteet();
    }

    public double getHinta() {
        return pizza.getHinta() ;
    }
}
