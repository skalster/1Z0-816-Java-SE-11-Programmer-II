package _4_built_in_functional_interfaces;


/*
    Use interfaces from java.util.function package




    Use core functional interfaces including Predicate, Consumer, Function and Supplier
    Use primitive and binary variations of base interfaces of java.util.function package
 */

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class UseUtilFunction {

    public void useBiConsumer() {
        BiConsumer biConsumer = (o, o2) -> {
            System.out.print(o);
            System.out.println(o2);
        };
        biConsumer.accept("Biconsumer ", "example!");
    }

    public void useBiFunction() {
        BiFunction<String, String, String> biFunction = (o, o2) -> {
            System.out.print(o);
            System.out.println(o2);
            return o + o2;
        };
        String biFunctionResult = biFunction.apply("BiFunction ", " test");
        System.out.println("Function result: " + biFunctionResult);
    }

    public void useBinaryOperator() {
        BinaryOperator<String> binaryOperator = (o, o2) -> o + o2;
        String binaryOperatorResult = binaryOperator.apply("BinaryOperator ", " test");
        System.out.println("Function result: " + binaryOperatorResult);
    }

    public void useBiPredicate() {
        BiPredicate biPredicate = (o, o2) -> o.equals(o2);
//        BiPredicate biPredicate = Object::equals; Also compiles.
    }

    public static void main(String[] args) {
        UseUtilFunction useUtilFunction = new UseUtilFunction();

        useUtilFunction.useBiConsumer();

        useUtilFunction.useBiFunction();

        useUtilFunction.useBinaryOperator();
    }

}