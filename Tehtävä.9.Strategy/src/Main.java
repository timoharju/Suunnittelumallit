import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Converter c = new Converter();
        List<String> lista = new ArrayList<>();
        for (int i = 0 ; i <= 10; i++) {
            lista.add("String_Object " );
        }

        ListConverter arc = new ArrayConverter();
        ListConverter itc = new IteratorConverter();
        ListConverter lapc = new ListApiConverter();

        //Iterator Converter
        c.useConverter(itc);
        System.out.println("itc: \n" + c.convert(lista));
        System.out.println("\n\n\n");

        //Array Converter
        c.useConverter(arc);
        System.out.println("arc: \n" + c.convert(lista));
        System.out.println("\n\n\n");

        //ListApi Converter
        c.useConverter(lapc);
        System.out.println("lapc: \n" + c.convert(lista));
    }
}
