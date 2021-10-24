import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSet {
        public static void main(String[] args) {
            List<String> list2 = new ArrayList<>();
            list2.add("1");
            list2.add("2");
            list2.add("3");
            list2.add("2");
            //преобразование в коллекцию Set
            Set<String> set1 = new HashSet<>(list2);

        }
    }