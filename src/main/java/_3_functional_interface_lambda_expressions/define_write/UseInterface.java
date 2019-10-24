package _3_functional_interface_lambda_expressions.define_write;

/**
 * Define and write functional interfaces
 */
public class UseInterface {

    // Short range -32,768 and a maximum value of 32,767

    public void useFunctionalInterface(FunctionalInterfaceDefinition function) {
        short shorty = 4;
        byte byty = function.applyAsByte(shorty);
        System.out.println(byty);
    }

    public static void main(String[] args) {
        UseInterface useInterface = new UseInterface();
        useInterface.useFunctionalInterface(s -> (byte) s);
    }
}
