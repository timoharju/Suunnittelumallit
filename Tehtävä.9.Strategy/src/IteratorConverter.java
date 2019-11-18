
import java.util.Iterator;
import java.util.List;

public class IteratorConverter implements ListConverter {

    @Override
    public String listToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            sb.append(iterator.next()).append("\n");
        }
        return sb.toString();
    }
}
