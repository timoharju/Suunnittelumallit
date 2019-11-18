import java.util.List;

public class Converter {

    private ListConverter converter;

    public Converter() {

    }

    public Converter(ListConverter converter) {
        this.converter = converter;
    }

    public void useConverter(ListConverter converter) {
        this.converter = converter;
    }

    public String convert(List<String> list) {
        return converter.listToString(list);
    }

}