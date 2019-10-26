package abstractfactory;

public class BossFactory extends AbstractFactory {
    @Override
    public Vaate createVaate(String vaatetyyppi) {
        return new BossTuote(vaatetyyppi);
    }
}
