package app;

import burger.ListBurger;

public class HesburgerBurgerBuilder extends BurgerBuilder {

	@Override
	public void createNewBurger() {
		burger = new ListBurger();
	}

	@Override
	public void buildSalad() {
		burger.setSalad("salad");
	}

	@Override
	public void buildPatty() {
		burger.setPatty("beef");
	}

	@Override
	public void buildSauce() {
		burger.setSauce("mayonnaise");
	}

}
