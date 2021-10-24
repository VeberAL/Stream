import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapTransformUpperCase {
    public static void main(String[] args) {
        //Преобразование в верхний регистр и стрим в лист (collect)
        List<String> list8 = Stream.of("one", "two").map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(list8);

    }
}
