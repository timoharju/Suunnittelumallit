package app;

import burger.Burger;

public abstract class BurgerBuilder {
	protected Burger burger;
	
	public Burger getBurger() {
		return burger;
	}
	
	public abstract void createNewBurger();
	public abstract void buildSalad();
	public abstract void buildPatty();
	public abstract void buildSauce();
}
