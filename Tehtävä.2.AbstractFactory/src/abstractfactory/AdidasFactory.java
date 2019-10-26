package abstractfactory;

public class AdidasFactory extends AbstractFactory {

    @Override
    public Vaate createVaate(String vaatetyyppi) {
        return new AdidasTuote(vaatetyyppi);
    }
}
