package com.company;

public class Charmander implements PokemonState {
	
	private static Charmander instance;
	
	private Charmander() {
		
	}

	@Override
	public void isku1() {
		System.out.println("Charmander used ember");
	}

	@Override
	public void isku2() {
		System.out.println("Charmander used scratch");
	}

	@Override
	public void isku3() {
		System.out.println("Charmander used flamethrower");
	}
	
	public static synchronized Charmander getInstance() {
		if(instance == null) {
			return instance = new Charmander();
		} else {
			return instance;
		}
	}
	
	@Override
	public String toString() {
		return "Charmander";
	}

	@Override
	public void kehity(Pokemon pokemon) {
		pokemon.changeState(Charmeleon.getInstance());
	}

}
