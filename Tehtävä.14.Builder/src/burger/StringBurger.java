package burger;

public class StringBurger implements Burger {
	
	private StringBuilder parts;
	
	public StringBurger() {
		parts = new StringBuilder();
	}

	@Override
	public void setPatty(String patty) {
		parts.append("Patty: " + patty + "\n");
	}

	@Override
	public void setSalad(String salad) {
		parts.append("Salad: " + salad + "\n");
	}

	@Override
	public void setSauce(String sauce) {
		parts.append("Sauce: " + sauce + "\n");
	}
	
	public String getBurgerParts() {
		return parts.toString();
	}

}
