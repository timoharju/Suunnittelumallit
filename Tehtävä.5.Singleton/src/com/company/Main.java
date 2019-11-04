package com.company;

public class Main {

    public static void main(String[] args) {
        //Ensimmäinen ilmeentymä
        JuomaFactory JF = JuomaFactory.getInstance();
	    ErikoisJuoma juoma1 = JF.createJuoma("IPA");

        System.out.println("Instanssi ID on " + JF.hashCode());
        System.out.println(juoma1.toString());

        //Yritetään luoda toinen ilmeentymä
        JuomaFactory JFF = JuomaFactory.getInstance();
        ErikoisJuoma juoma2 = JF.createJuoma("APA");
        System.out.println("Instanssi ID on " + JFF.hashCode());
        System.out.println(juoma2.toString());

    }
}
