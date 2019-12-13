package _4_built_in_functional_interfaces;

import java.util.function.BiPredicate;

public class Predicates {

    // Java comparison comparators == != < > <= >=
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
}
