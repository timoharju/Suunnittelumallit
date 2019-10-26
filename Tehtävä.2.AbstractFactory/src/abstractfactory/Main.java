package abstractfactory;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) {

        System.out.println("Opiskellessa");

        Jasper jasper = new Jasper(new AdidasFactory());
        jasper.pueVaatteet();
        jasper.luetteleVaatteet();

        System.out.println("\nInsinöörinä");
        jasper.setTehdas(new BossFactory());
        jasper.pueVaatteet();
        jasper.luetteleVaatteet();
    }
}
