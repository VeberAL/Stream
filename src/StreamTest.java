import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        //вывод
        list.stream().forEach(x -> System.out.println(x));
    }
}
