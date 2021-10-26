import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Statistics {
    public static void main(String[] args) {
        //Среднее арифметическое значение элементов массива
        IntStream a1 = Stream.of(1,2,5,9).mapToInt(x -> x);
        double a = a1.summaryStatistics().getAverage();
        System.out.println(a);
    }
}
