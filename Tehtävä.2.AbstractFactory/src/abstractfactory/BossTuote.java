package abstractfactory;

public class BossTuote implements Vaate{

    private String vaateTyyppi;

    public BossTuote(String vaateTyyppi) {
        this.vaateTyyppi = vaateTyyppi;
    }

    @Override
    public String toString() {
        return "Bossin: " + vaateTyyppi;
    }
}