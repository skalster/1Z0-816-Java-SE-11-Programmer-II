package _4_built_in_functional_interfaces;

import java.util.function.BooleanSupplier;

public class Suppliers {

    public void useBooleanSupplier() {
        BooleanSupplier booleanSupplierIsEmptySpace = () -> "".isEmpty();
//        BooleanSupplier booleanSupplierIsEmptySpace = ""::isEmpty; // Also compiles
        System.out.println("BooleanSupplier booleanSupplierIsEmptySpace" + booleanSupplierIsEmptySpace.getAsBoolean());
    }
}
