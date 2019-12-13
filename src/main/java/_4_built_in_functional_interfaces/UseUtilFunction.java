package _4_built_in_functional_interfaces;


/*
    Use interfaces from java.util.function package

    Use core functional interfaces including Predicate, Consumer, Function and Supplier
    Use primitive and binary variations of base interfaces of java.util.function package

    Consumers 8
    Functions 11
    Supplier 5
    Unary 3
    Binary 4
    Predicate 4


 */

import java.util.Comparator;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

public class UseUtilFunction {



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
//        binaryOperator.andThen();
//        BinaryOperator.maxBy();
//        BinaryOperator.minBy();
        System.out.println("Function result: " + binaryOperatorResult);

        BinaryOperator<Integer> biMaxBy = BinaryOperator.maxBy(Comparator.naturalOrder());
        System.out.println("BinaryOperator.maxBy 8 and 9 natural order: " + biMaxBy.apply(8, 9));

        BinaryOperator<Integer> biMinBy = BinaryOperator.minBy(Comparator.naturalOrder());
        System.out.println("BinaryOperator.maxBy 2 and 4 natural order: " + biMinBy.apply(2, 4));
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


    public void useDoubleBinaryOperator() {
        DoubleBinaryOperator doubleBinaryOperator = (v, v1) -> v * v1;
        System.out.println("DoubleBinaryOperator: " + doubleBinaryOperator.applyAsDouble(0.88, 0.99));
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

    public void useIntBinaryOperator() {
        IntBinaryOperator intBinaryOperator = (i, i1) -> i + i1;

        System.out.println("IntBinaryOperator " + intBinaryOperator.applyAsInt(5, 4));
    }

    public void useIntFunction() {
        IntFunction intFunction = i -> i + 1;
        System.out.println("IntFunction " + intFunction.apply(5));
    }

    public void useIntPredicate() {
        IntPredicate intPredicate = i -> i != 0;
        System.out.println("IntPredicate: Is 1 equal zero: " + intPredicate.test(1));
    }

    public void useIntSupplier() {
        IntSupplier intSupplier = () -> new Random().nextInt();
        System.out.println("IntSupplier get a random int: " + intSupplier.getAsInt());
    }

    public void useIntToDoubleFunction() {
        IntToDoubleFunction intToDoubleFunction = i -> (double) i;
        System.out.println("IntToDouble : " + intToDoubleFunction.applyAsDouble(21));
    }

    public void useIntToLongFunction() {
        IntToLongFunction intToLongFunction = i -> (long) i;
        System.out.println("IntToLongFunction : " + intToLongFunction.applyAsLong(21));
    }

    public void useIntUnaryOperator() {
        int value = 21;
        IntUnaryOperator intUnaryOperator = i -> i + 13;
        System.out.println("IntToLongFunction : " + intUnaryOperator.applyAsInt(value));
        System.out.println(intUnaryOperator.compose(intUnaryOperator).applyAsInt(value));
    }

    public void useLongBinaryOperator() {
        LongBinaryOperator longBinaryOperator = (l, l1) -> l * l1;
        System.out.println("LongBinaryOperator : " + longBinaryOperator.applyAsLong(3L, 5L));
    }

    public void useLongFunction() {
        LongFunction<String> longFunction = String::valueOf;
        System.out.println("LongFunction : " + longFunction.apply(315));
    }

    public void useLongPredicate() {
        LongPredicate longPredicateBigger = l -> l > 315;
        LongPredicate longPredicateSmaller = l -> l < 315;
        System.out.println("LongPredicate : " + longPredicateBigger.test(316));
        System.out.println("LongPredicate : " + longPredicateBigger.negate().test(316));
        System.out.println("LongPredicate : " + longPredicateBigger.and(longPredicateSmaller).test(316));
        System.out.println("LongPredicate : " + longPredicateBigger.or(longPredicateSmaller).test(316));
    }

    public void useLongSupplier() {
        LongSupplier longSupplier = () -> new Random().nextLong();
        System.out.println("LongSupplier : " + longSupplier.getAsLong());
    }

    public void useLongToDoubleFunction() {
        LongToDoubleFunction longToDoubleFunction = l -> (double) l * 1.0;
        System.out.println("LongToDoubleFunction : " + longToDoubleFunction.applyAsDouble(16L));
    }

    public void useLongToIntFunction() {
        LongToIntFunction longToIntFunction = l -> (int) l;
        System.out.println("LongToIntFunction : " + longToIntFunction.applyAsInt(21L));
    }

    public void useLongUnaryOperator() {
        LongUnaryOperator longUnaryOperator = l -> l * 10;
        LongUnaryOperator longUnaryOperator100 = l -> l * 100;
        System.out.println("LongUnaryOperator : " + longUnaryOperator.applyAsLong(21L));
        System.out.println("LongUnaryOperator : " + longUnaryOperator.compose(longUnaryOperator100).applyAsLong(13L));
    }

    public void usePredicate() {
        Predicate<String> predicate = o -> o.equalsIgnoreCase("Nietzche");
        System.out.println("Predicate: " + predicate.test("Nietzche"));
        Predicate<String> emptyPredicate = s -> !s.isEmpty();

        System.out.println("Predicate : " + predicate.negate().test("Nietzche"));
        System.out.println("Predicate : " + predicate.and(emptyPredicate).test("Nietzsche"));
        System.out.println("Predicate : " + predicate.or(emptyPredicate).test("D"));
    }

    public void useSupplier() {
        Supplier<Integer> supplier = () -> new Random().nextInt();
        System.out.println("Supplier: " + supplier.get());
    }

    public void useToDoubleBiFunction() {
        ToDoubleBiFunction<Integer, Long> toDoubleBiFunction = (s, s2) -> (double) s + s2;
        double result = toDoubleBiFunction.applyAsDouble(13, 21L);
        System.out.println(result);
    }

    public void useToDoubleFunction() {
        ToDoubleFunction<Integer> toDoubleFunction = (s) -> (double) s;
        double result = toDoubleFunction.applyAsDouble(13);
        System.out.println(result);
    }

    public void useToIntBiFunction() {
        ToIntBiFunction<Integer, Byte> toIntBiFunction = Integer::sum;
//        ToIntBiFunction<Integer, Byte> toIntBiFunction = (integer, aByte) -> integer + aByte;
        byte aByte = 55;
        int result = toIntBiFunction.applyAsInt(13, aByte);
        System.out.println(result);
    }

    public void useToIntFunction() {
        ToIntFunction<Byte> toIntFunction = (s) -> (int) s;
        int result = toIntFunction.applyAsInt((byte) 55);
        System.out.println(result);
    }

    public void useToLongBiFunction() {
        ToLongBiFunction<Byte, Integer> toLongBiFunction = (aByte, integer) -> (long) aByte + integer;
        long result = toLongBiFunction.applyAsLong((byte) 55, 21);
        System.out.println(result);
    }

    public void useToLongFunction() {
        ToLongFunction<Integer> toLongFunction = (s) -> (long) s;
        long result = toLongFunction.applyAsLong(55);
        System.out.println(result);
    }

    public void useUnaryOperator() {
        UnaryOperator<String> unaryOperator = String::toUpperCase;
//        UnaryOperator<String> unaryOperator = o -> o.toUpperCase();
        UnaryOperator<String> unaryOperatorExclamation = o -> o = "¡" + o;
        UnaryOperator<String> unaryOperatorExclamationAfter = o -> o += "!";

        System.out.println(unaryOperator
                .compose(unaryOperatorExclamation)
                .andThen(unaryOperatorExclamationAfter).apply("hola"));
    }


    public static void main(String[] args) {
        UseUtilFunction useUtilFunction = new UseUtilFunction();

//        useUtilFunction.useBiConsumer();

        useUtilFunction.useBiFunction();

        useUtilFunction.useBinaryOperator();

        useUtilFunction.useBiPredicate();

        useUtilFunction.useBooleanSupplier();

//        useUtilFunction.useConsumer();

        useUtilFunction.useDoubleBinaryOperator();

//        useUtilFunction.useDoubleConsumer();

        useUtilFunction.useDoubleFunction();

        useUtilFunction.useDoublePredicate();

        useUtilFunction.useDoubleSupplier();

        useUtilFunction.useDoubleToIntFunction();

        useUtilFunction.useDoubleToLongFunction();

        useUtilFunction.useDoubleUnaryOperator();

        useUtilFunction.useFunction();

        useUtilFunction.useIntBinaryOperator();

//        useUtilFunction.useIntConsumer();

        useUtilFunction.useIntFunction();

        useUtilFunction.usePredicate();

        useUtilFunction.useUnaryOperator();
    }

}