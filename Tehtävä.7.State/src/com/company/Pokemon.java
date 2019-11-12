package com.company;

public class Pokemon {

    private PokemonState state;

    public Pokemon() {
        state = Charmander.getInstance();
    }

    public void changeState(PokemonState state) {
        this.state = state;
    }

    public void kehity() {
        state.kehity(this);
    }

    public void isku1() {
        state.isku1();
    }

    public void isku2() {
        state.isku2();
    }

    public void isku3() {
        state.isku3();
    }

    @Override
    public String toString() {
        return state.toString();
    }
}
