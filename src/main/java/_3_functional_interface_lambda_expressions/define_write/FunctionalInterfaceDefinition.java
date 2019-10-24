package _3_functional_interface_lambda_expressions.define_write;

/**
 * Any interface with a SAM(Single Abstract Method) is a functional interface, and its implementation may be treated as
 * lambda expressions. All functional interfaces are recommended to have an informative @FunctionalInterface annotation.
 * It allows a compiler to generate an error if the annotated interface does not satisfy the conditions.
 * Note that Java 8's default methods are not abstract and do not count: a functional interface may still have multiple
 * default methods.
 *
 * A  functional  interface  must  have  one  abstract—unimplemented—method.  It may  have  zero  or  more  default
 * or  implemented  methods.  It  may  also  have  static methods.
 */

@FunctionalInterface
public interface FunctionalInterfaceDefinition {

    byte applyAsByte(short s);

}

