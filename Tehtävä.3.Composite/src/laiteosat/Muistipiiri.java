package laiteosat;

import java.util.ArrayList;
import java.util.List;

public class Muistipiiri implements Laiteosa {

    public Muistipiiri(double hinta) {
        this.osat = new ArrayList<>();
        this.hinta = hinta;
    }

    private List<Laiteosa> osat;
    private double hinta;

    @Override
    public double getHinta() {
        double osienHinta = 0;

        for (Laiteosa osa:osat
        ) {
            osienHinta=osa.getHinta()+osienHinta;
        }
        return osienHinta + hinta;
    }

    @Override
    public void AddOsa(Laiteosa osa) {
        this.osat.add(osa);
    }

    @Override
    public List<Laiteosa> getOsat() {
        return this.osat;
    }

    @Override
    public void getInfo() {
        System.out.println(this + " (" + hinta + ") " + getHinta());
        getOsat().forEach(Laiteosa::getInfo);
    }
}

