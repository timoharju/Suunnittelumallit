package abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class Jasper {
    private List<Vaate> vaatteet;
    private AbstractFactory vaatetehdas;

    public Jasper(AbstractFactory vaatetehdas) {
        this.vaatetehdas = vaatetehdas;
    }

    public void setTehdas(AbstractFactory vaatetehdas) {
        this.vaatetehdas = vaatetehdas;
    }

    public void pueVaatteet() {
        this.vaatteet = new ArrayList<>();
        vaatteet.add(vaatetehdas.createVaate("lippis"));
        vaatteet.add(vaatetehdas.createVaate("kengät"));
        vaatteet.add(vaatetehdas.createVaate("t-paita"));
        vaatteet.add(vaatetehdas.createVaate("farkut"));
    }

    public void luetteleVaatteet() {
        vaatteet.forEach(System.out::println);;
    }

}

