import java.util.List;

public class ListApiConverter implements ListConverter {

    @Override
    public String listToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i % 3 == 2) sb.append("\n");
        }

        return sb.toString();
    }
}
