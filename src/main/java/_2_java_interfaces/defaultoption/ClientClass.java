package _2_java_interfaces.defaultoption;

public class ClientClass implements InterfaceWithDefault {

    // implementing abstract method
    public void existingMethod(String str) {
        System.out.println("String is: " + str);
    }

    public static void main(String[] args) {
        InterfaceWithDefault obj = new ClientClass();

        //calling the default method of interface
        obj.newMethod();
        //calling the abstract method of interface
        obj.existingMethod("Java 8 is easy to learn");

    }

}
