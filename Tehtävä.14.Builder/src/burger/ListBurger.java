package burger;

import java.util.ArrayList;
import java.util.List;

public class ListBurger implements Burger {
	
	private List<String> parts;
	
	public ListBurger() {
		this.parts = new ArrayList<>();
	}

	@Override
	public void setPatty(String patty) {
		parts.add(new Patty(patty).getPatty());
	}

	@Override
	public void setSalad(String salad) {
		parts.add(new Salad(salad).getSalad());
	}

	@Override
	public void setSauce(String sauce) {
		parts.add(new Sauce(sauce).getSauce());
	}
	
	public List<String> getBurgerParts(){
		return parts;
	}

}
