import java.util.ArrayList;
import java.util.List;

public class GenericSum {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(20);
        int sum = ls.get(0) + ls.get(1);
        System.out.println(sum);

        List<String> str = new ArrayList<>();
        str.add("Hello");
        str.add(" World");

        System.out.println(str.get(0) + str.get(1));

    }
}
