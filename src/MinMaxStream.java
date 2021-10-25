import java.util.Comparator;
import java.util.stream.Stream;

public class MinMaxStream {
    public static void main(String[] args) {
        //Поиск минимального и максимального значения в коллекции
        int value1 = Stream.of(4,-6,1,2,4,17).min(Comparator.comparing(x -> x)).get();
        int value2 = Stream.of(1,2,-4,17,5).max(Comparator.comparing(x -> x)).get();
        System.out.println("Минимальный элемент:"+ value1 +". Максимальный элемент: "+ value2);
    }
}
