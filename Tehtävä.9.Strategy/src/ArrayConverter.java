import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ArrayConverter implements ListConverter {
    @Override
    public String listToString( List<String> list) {
        Object[] arr = list.toArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            sb.append(arr[i] + " ");
            if (i % 2 == 0) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}

