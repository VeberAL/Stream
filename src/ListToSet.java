import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToSet {


    public class Filter {
        public static void main(String[] args) {
            List<String> list2 = new ArrayList<>();
            list2.add("1");
            list2.add("2");
            list2.add("3");
            list2.add("2");
            //преобразование в коллекцию Set
            Set<String> set1 = list2.stream().filter(x -> x.equals("2")).collect(Collectors.toSet());

        }
    }
}