import java.util.Comparator;
import java.util.stream.Stream;

public class MinMaxStream {
    public static void main(String[] args) {
    int value1 = Stream.of(4,-6,1,2,4,17).min(Comparator.comparing(x -> x)).get();
    int value2 = Stream.of(1,2,-4,17,5).max(Comparator.comparing(x -> x)).get();
        System.out.println(value1 +" "+ value2);
    }
}
