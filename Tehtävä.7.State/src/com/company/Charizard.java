package com.company;

public class Charizard implements PokemonState {
	
	private static Charizard instance;

	private Charizard() {
		
	}
	
	@Override
	public void isku1() {
		System.out.println("Charizard used Fire Spin");
	}

	@Override
	public void isku2() {
		System.out.println("Charizard used Blast Burn");
	}

	@Override
	public void isku3() {
		System.out.println("Charizard used Fly");
	}
	
	@Override
	public String toString() {
		return "Charizard";
	}
	
	public static synchronized Charizard getInstance() {
		if(instance == null) {
			return instance = new Charizard();
		} else {
			return instance;
		}
	}

	@Override
	public void kehity(Pokemon pokemon) {
		System.out.println("Charizard can't evolve");
	}

}
