package app;

import burger.Burger;

public class BurgerDirector {
	
	private BurgerBuilder builder;
	
	public void setBurgerBuilder(BurgerBuilder builder) {
		this.builder = builder;
	}
	
	public void constructBurger() {
		builder.createNewBurger();
		builder.buildPatty();
		builder.buildSalad();
		builder.buildSauce();
	}
	
	public Burger getBurger() {
		return builder.getBurger();
	}
}
