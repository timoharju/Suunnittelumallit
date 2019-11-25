package app;

import burger.StringBurger;

public class McDonaldsBurgerBuilder extends BurgerBuilder {

	@Override
	public void createNewBurger() {
		burger = new StringBurger();
	}

	@Override
	public void buildSalad() {
		burger.setSalad("lettuce + tomato");
	}

	@Override
	public void buildPatty() {
		burger.setPatty("ground beef");
	}

	@Override
	public void buildSauce() {
		burger.setSauce("big mac");
	}
	
}
