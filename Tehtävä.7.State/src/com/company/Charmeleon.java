package com.company;

public class Charmeleon implements PokemonState {
	
	private static Charmeleon instance;
	
	private Charmeleon() {
		
	}

	@Override
	public void isku1() {
		System.out.println("Charmeleon used Fire Fang");
	}

	@Override
	public void isku2() {
		System.out.println("Charmeleon used Ember");
	}

	@Override
	public void isku3() {
		System.out.println("Charmeleon used Flamethrower");
	}
	
	public static synchronized Charmeleon getInstance() {
		if(instance == null) {
			return instance = new Charmeleon();
		} else {
			return instance;
		}
	}
	
	@Override
	public String toString() {
		return "Charmeleon";
	}

	@Override
	public void kehity(Pokemon pokemon) {
		pokemon.changeState(Charizard.getInstance());
	}

}
