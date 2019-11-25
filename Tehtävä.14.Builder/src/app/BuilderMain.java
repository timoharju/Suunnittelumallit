package app;

import burger.ListBurger;
import burger.StringBurger;

public class BuilderMain {

	public static void main(String[] args) {
		BurgerBuilder mcd = new McDonaldsBurgerBuilder();
		BurgerBuilder hesb = new HesburgerBurgerBuilder();
		BurgerDirector director = new BurgerDirector();
		
		director.setBurgerBuilder(mcd);
		director.constructBurger();
		
		StringBurger burger = (StringBurger)director.getBurger();
		System.out.println("McDonalds burger:\n" + burger.getBurgerParts());
		
		director.setBurgerBuilder(hesb);
		director.constructBurger();
		ListBurger burger1 = (ListBurger)director.getBurger();
		System.out.println("Hesburger burger:");
		burger1.getBurgerParts().forEach(System.out::println);
		
	}

}
