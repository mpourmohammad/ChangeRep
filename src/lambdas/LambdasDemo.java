package lambdas;

import java.util.List;
import java.util.function.UnaryOperator;

public class LambdasDemo {
    public LambdasDemo(String message) {
    }

    public static boolean show() {
//        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        list.forEach(System.out::println);

        UnaryOperator<Integer> square = n -> n * n;
        System.out.println(square.apply(10));

        return false;
    }
}
