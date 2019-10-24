package _2_java_interfaces.private_method;

public class ClientClass implements InterfaceWithPrivate {

    // implementing abstract method
    public void existingMethod(String str) {
        System.out.println("String is: " + str);
    }

    public static void main(String[] args) {
        InterfaceWithPrivate interfaceWithPrivateMethod = new ClientClass();

        //calling the default method of interface
        interfaceWithPrivateMethod.newMethod();
        //calling the abstract method of interface
        interfaceWithPrivateMethod.existingMethod("Java 8 is easy to learn");

        // privateMethod is not visible from the implementing class.

        // privateStaticMethod is not visible from the implementing class.

    }

}
