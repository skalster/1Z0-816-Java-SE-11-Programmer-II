package _2_java_interfaces.private_method;

interface InterfaceWithPrivate {
    /* This is a default method so we need not
     * to implement this method in the implementation
     * classes
     */
    default void newMethod() {
        System.out.println("Newly added default method");
        privateMethod();
        privateStaticMethod();
    }

    /* Already existing public and abstract method
     * We must need to implement this method in
     * implementation classes.
     */
    void existingMethod(String str);


    private void privateMethod() {
        System.out.println("private method");
    }

    private static void privateStaticMethod() {
        System.out.println("private static method");
    }
}