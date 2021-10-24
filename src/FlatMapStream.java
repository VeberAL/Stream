import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.add("qwe");
        list.add("wer");
        list1.add("rty");
        //склейка двух list в один flatmap
        list1 = Stream.of(list,list1).flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(list1);
    }
}