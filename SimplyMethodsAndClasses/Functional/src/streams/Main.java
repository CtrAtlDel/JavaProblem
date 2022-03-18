package streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Object obj;
        String[] arraysStr = {"as", "a", "the", " ", "d", "on", "and", ""};
        var stream = Arrays.stream(arraysStr).filter(s -> s.length() > 2).toList();
        System.out.println(Arrays.stream(arraysStr).filter(s-> s.length() > 2).collect(Collectors.toList()));
    }
}
