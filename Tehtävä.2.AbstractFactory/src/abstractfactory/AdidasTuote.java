package abstractfactory;

public class AdidasTuote implements Vaate{
    private String vaateTyyppi;

    public AdidasTuote(String vaateTyyppi) {
        this.vaateTyyppi = vaateTyyppi;
    }

    @Override
    public String toString() {
        return "Adidaksen: " + vaateTyyppi;
    }
}

