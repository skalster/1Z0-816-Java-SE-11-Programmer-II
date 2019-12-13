package _4_built_in_functional_interfaces;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;

/**
 * Functions 11
 */
public class Functions {

    public void useBiFunction() {
        BiFunction<String, String, String> biFunction = (o, o2) -> {
            System.out.print(o);
            System.out.println(o2);
            return o + o2;
        };
        String biFunctionResult = biFunction.apply("BiFunction ", " test");
        System.out.println("Function result: " + biFunctionResult);
    }

    public void useDoubleFunction() {
        DoubleFunction doubleFunction = v -> v + 1.0;

        System.out.println("DoubleFunction " + doubleFunction.apply(2.1));
    }
}
