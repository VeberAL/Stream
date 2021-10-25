import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapToInt {
    public static void main(String[] args) {
        //Сумма элементов и перевод их в тип integer
        int a1 = Stream.of(1,2,3,4,5).mapToInt(x -> x).sum();
        System.out.println(a1);
    }
}
