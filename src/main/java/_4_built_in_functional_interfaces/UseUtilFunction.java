package _4_built_in_functional_interfaces;


/*
    Use interfaces from java.util.function package

    Use core functional interfaces including Predicate, Consumer, Function and Supplier
    Use primitive and binary variations of base interfaces of java.util.function package
 */

import java.util.function.*;

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

    // Java c
    // omparison comparators == != < > <= >=
    public void useBiPredicate() {
        int number1 = 5;
        int number2 = 4;

        BiPredicate<Integer, Integer> biPredicateEquals = (o, o2) -> o == o2;
        BiPredicate<Integer, Integer> biPredicateNotEquals = (o, o2) -> o != o2;
        BiPredicate<Integer, Integer> biPredicateBiggerThan = (o, o2) -> o > o2;
        //        BiPredicate<Integer, Integer> biPredicate = Object::equals; //Also compiles.

        System.out.println("BiPredicate bigger than: " + number1 + " " + number2 + " " +
                biPredicateBiggerThan.test(number1, number2));

        System.out.println("BiPredicate bigger than AND not equal test: " + number1 + " " + number2 + " " +
                biPredicateBiggerThan.and(biPredicateNotEquals).test(number1, number2));

        System.out.println("BiPredicate bigger than OR  equal test: " + number2 + " " + number2 + " " +
                biPredicateBiggerThan.or(biPredicateEquals).test(number2, number2));

        System.out.println("BiPredicate negate equal test: " + number1 + " " + number2 + " " +
                biPredicateEquals.negate().test(number1, number2));
    }

    public void useBooleanSupplier() {
        BooleanSupplier booleanSupplierIsEmptySpace = () -> "".isEmpty();
//        BooleanSupplier booleanSupplierIsEmptySpace = ""::isEmpty; // Also compiles
        System.out.println("BooleanSupplier booleanSupplierIsEmptySpace" + booleanSupplierIsEmptySpace.getAsBoolean());
    }

    public void useConsumer() {
        Consumer<String> consumer = s -> System.out.println(s);
//        Consumer<String> consumer = System.out::println;
        consumer.accept("Consumer interface example.");
    }

    public void useDoubleBinaryOperator() {
        DoubleBinaryOperator doubleBinaryOperator = (v, v1) -> v * v1;
        System.out.println("DoubleBinaryOperator: " + doubleBinaryOperator.applyAsDouble(0.88, 0.99));
    }

    public void useDoubleConsumer() {
        DoubleConsumer consumer = v -> System.out.println("DoubleConsumer: " + v);
//        Consumer<String> consumer = System.out::println;
        consumer.accept(10.141516d);
    }

    public void useDoubleFunction() {
        DoubleFunction doubleFunction = v -> v + 1.0;

        System.out.println("DoubleFunction " + doubleFunction.apply(2.1));
    }

    public void useDoublePredicate() {
        DoublePredicate doublePredicateIsBiggerThanZero = v -> v > 0.0d;

        System.out.println("DoublePredicate is bigger than zero: " + doublePredicateIsBiggerThanZero.test(2.0d));
    }

    public void useDoubleSupplier() {
        DoubleSupplier doubleSupplierPi = () -> 3.141516d;

        System.out.println("DoubleSupplier Pi as double: " + doubleSupplierPi.getAsDouble());
    }

    public void useDoubleToIntFunction() {
        double value = 5.23d;
        DoubleToIntFunction doubleToIntFunction = v -> (int) v;
        System.out.println("DoubleToIntFunction " + doubleToIntFunction.applyAsInt(value));
    }

    public void useDoubleToLongFunction() {
        double value = 5232.56d;
        DoubleToLongFunction doubleToLongFunction = v -> (long) v;
        System.out.println("DoubleToLongFunction " + doubleToLongFunction.applyAsLong(value));
    }

    public void useDoubleUnaryOperator() {
        double value = 88.88;

        DoubleUnaryOperator doubleUnaryOperatorCalculateSquareArea = v -> v * v;

        System.out.println("DoubleUnaryOperator calculate square area: " +
                doubleUnaryOperatorCalculateSquareArea.applyAsDouble(value));

//        doubleUnaryOperatorCalculateSquareArea.andThen()
//        doubleUnaryOperatorCalculateSquareArea.compose();
    }

    /**
     * As you can see, the difference between compose and andThen is the order they execute the functions. While the
     * compose function executes the caller last and the parameter first, the andThen executes the caller first and
     * the parameter last.
     */
    public void useFunction() {
        Function<String, String> functionComa = s -> s.concat(",");
        Function<String, String> functionAppendSpace = s -> s.concat(" ");

        System.out.println("Function " + functionComa.andThen(functionAppendSpace).apply("Name"));

//        functionAppendSpace.compose();
    }


    public static void main(String[] args) {
        UseUtilFunction useUtilFunction = new UseUtilFunction();

        useUtilFunction.useBiConsumer();

        useUtilFunction.useBiFunction();

        useUtilFunction.useBinaryOperator();

        useUtilFunction.useBiPredicate();

        useUtilFunction.useBooleanSupplier();

        useUtilFunction.useConsumer();

        useUtilFunction.useDoubleBinaryOperator();

        useUtilFunction.useDoubleConsumer();

        useUtilFunction.useDoubleFunction();

        useUtilFunction.useDoublePredicate();

        useUtilFunction.useDoubleSupplier();

        useUtilFunction.useDoubleToIntFunction();

        useUtilFunction.useDoubleToLongFunction();

        useUtilFunction.useDoubleUnaryOperator();

        useUtilFunction.useFunction();
    }

}