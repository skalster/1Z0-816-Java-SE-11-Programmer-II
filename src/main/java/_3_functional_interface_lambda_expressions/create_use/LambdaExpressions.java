package _3_functional_interface_lambda_expressions.create_use;

import java.util.function.BiFunction;

/**
 *
 *
 * statement lambdas
 * param -> { return expression; }
 *
 * local-variable for lambda parameters
 *
 */
public class LambdaExpressions {

    public void localVariableLambdaParameters() {

        BiFunction<String, String, String> concatStrings = (String s1, String s2) -> s1 + s2; // Compiles in Java 8

        BiFunction<String, String, String> concatStrings1 = (var s1, var s2) -> s1 + s2; // Compiles in Java 11, not 10

        BiFunction<String, String, String> concatStrings2 = (s1, s2) -> s1 + s2; // Compiles in Java 11

        BiFunction<String, String, String> concatStrings3 = (@Deprecated var s1, @Deprecated var s2) -> s1 + s2; // Compiles in Java 11
        // We cannot use such annotations without specifying the types.


    }

}
