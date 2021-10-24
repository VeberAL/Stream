import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        List<String> list1 =new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("2");
        //фильтрация эквивалентных значению "2"
        list1.stream().filter(x -> {System.out.println(x);//lazy
                              return x.equals("2");}).count();//eager

    }
}
