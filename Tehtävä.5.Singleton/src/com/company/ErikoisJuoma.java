package com.company;

public class ErikoisJuoma {
    private String tyyppi;

    public ErikoisJuoma(String tyyppi) {
            this.tyyppi = tyyppi;
    }

    @Override
    public String toString() {
        return "Erikoisjuoma on " + tyyppi;
    }
}
