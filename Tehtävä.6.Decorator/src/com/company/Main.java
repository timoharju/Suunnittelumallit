package com.company;

public class Main {

    public static void main(String[] args) {
	    Pizza lihatonPizza = new Aurajuusto(new Mozzarella(new Tomaattikastike(((new Pohja())))));
        System.out.println("Lihaton Pizza");
        System.out.println("Täytteet: " + lihatonPizza.pizzanTäytteet());
        System.out.println("Hinta: " + lihatonPizza.getHinta() + " euroa");

        Pizza americanaPizza = new Aurajuusto(new Mozzarella((new Tomaattikastike(new Kinkku(new Pohja())))));
        System.out.println("Americana Pizza");
        System.out.println("Täytteet: " + americanaPizza.pizzanTäytteet() + " euroa");
        System.out.println("Hinta: " + americanaPizza.getHinta() + " euroa");

        Pizza fransescanaPizza = new Mozzarella(new Tomaattikastike(new Kinkku(new Herkkusieni(new Pohja()))));
        System.out.println("Fransescana Pizza");
        System.out.println("Täytteet: " + fransescanaPizza.pizzanTäytteet());
        System.out.println("Hinta: " + fransescanaPizza.getHinta() + " euroa");
    }
}
