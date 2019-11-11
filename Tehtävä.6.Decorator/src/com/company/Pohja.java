package com.company;

public class Pohja implements Pizza {


    @Override
    public String pizzanTäytteet() {
        return "Pohja";
    }

    @Override
    public double getHinta() {
        return 5.00;
    }
}
