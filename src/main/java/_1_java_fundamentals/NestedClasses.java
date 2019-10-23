package _1_java_fundamentals;

/**
 * Modifiers Applied
 *
 * Normal inner class will be treated as a member of the outer class so it can have several Modifiers as opposed to Class.
 *
 *         final
 *         abstract
 *         public
 *         private
 *         protected
 *         strictfp
 *
 *
 */

public class NestedClasses {

    // Static block
    static {
        // variables
        System.out.println(PublicStaticInnerClass.staticPrivateText);
        // Methods
        PublicStaticInnerClass.privateStaticMethod();
        PublicStaticInnerClass.publicStaticMethod();
    }

    private String text; // Not accessible (or visible) from inner classes.
    private final String finalText = "finalText"; // Accessible from InnerClasses as it is final.
    private ProtectedInnerClass protectedClazzField = this.new ProtectedInnerClass();

    public NestedClasses() {
        usingPublicNestedClass();

        usingProtectedNestedClass();

        usingPackageProtectedNestedClass();

        usingPrivateNestedClass();
    }

    private void usingPublicNestedClass() {
        NestedClasses nestedClazz = new NestedClasses();

        // Public
        PublicInnerClass clazz = this.new PublicInnerClass();
        PublicInnerClass clazz2 = nestedClazz.new PublicInnerClass();

        // InnerClassPublic variables
        clazz.privateTextPublicClass = "ModifyingOuterMethod";
        clazz.publicText = "ModifyingOuterMethod";

        // InnerClassPublic methods
        clazz.innerPublicMethod();
        clazz.innerProtectedMethod();
        clazz.innerPackageProtectedMethod();
        clazz.innerPrivateMethod();


    }

    private void usingProtectedNestedClass(){
        NestedClasses nestedClazz = new NestedClasses();
        // Protected
        ProtectedInnerClass protectedClazz = this.new ProtectedInnerClass();
        ProtectedInnerClass protectedClazz2 = nestedClazz.new ProtectedInnerClass();

        protectedClazz.privateText = "";
//        protectedClazz.publicText = "";


    }

    private void usingPackageProtectedNestedClass(){
        NestedClasses nestedClazz = new NestedClasses();
        // Protected
        PackageProtectedInnerClass classPackageProtected = this.new PackageProtectedInnerClass();
        PackageProtectedInnerClass protectedClazz2 = nestedClazz.new PackageProtectedInnerClass();

        classPackageProtected.privateText = "";
        classPackageProtected.publicText = "";


    }

    private void usingPrivateNestedClass(){
        NestedClasses nestedClazz = new NestedClasses();
        // Private
        PrivateInnerClass privateInnerClass = this.new PrivateInnerClass();
        PrivateInnerClass privateInnerClass2 = nestedClazz.new PrivateInnerClass();

        privateInnerClass.privateText = "";
//        privateInnerClass2.publicText = "";


    }

    private void usingStaticNestedClass(){

        NestedClasses.PublicStaticInnerClass.publicStaticMethod();

        NestedClasses.ProtectedStaticInnerClass.publicStaticMethod();

        NestedClasses.PackageProtectedStaticInnerClass.publicStaticMethod();

        NestedClasses.StaticPrivateInnerClass.publicStaticMethod();
    }

    public class PublicInnerClass {
        private String privateTextPublicClass;
        public String publicText;
        public NestedClasses nc = new NestedClasses();

        public PublicInnerClass() {
            privateTextPublicClass = "constructorPrivateText";
            publicText = "constructorPublicText";
        }

        public void innerPublicMethod(){
            nc.text = "";
            System.out.println(finalText); // Accessible from InnerClasses as is final.
        }

        protected void innerProtectedMethod(){
            System.out.println("innerProtectedMethod");
        }

        void innerPackageProtectedMethod(){
            System.out.println("innerProtectedMethod");
        }

        private void innerPrivateMethod(){
            System.out.println("innerPrivateMethod");
        }
    }

    /**
     * If the class inherits from another class then protected doesn't compile in the subclass.
     * If a protected class inherits from a public class and the protected class is the parent for a class in another
     * package. Then the subclass can NOT instantiate the protected parent class. It can contain a reference but not
     * use the keyword new.
     *
     */
    protected class ProtectedInnerClass {
        private String privateText = "privateText";
        private String privateTextPublicClass;
        public String publicText;
        public NestedClasses nc = new NestedClasses();

        public ProtectedInnerClass() {
            privateTextPublicClass = "constructorPrivateText";
            publicText = "constructorPublicText";
        }

        public void innerPublicMethod(){
            nc.text = "";
            System.out.println(finalText); // Accessible from InnerClasses as is final.
        }

        protected void innerProtectedMethod(){
            System.out.println("innerProtectedMethod");
        }

        void innerPackageProtectedMethod(){
            System.out.println("innerProtectedMethod");
        }

        private void innerPrivateMethod(){
            System.out.println("innerPrivateMethod");
        }
    }

    class PackageProtectedInnerClass extends PublicInnerClass {
        private String privateText = "privateText";
    }

    private class PrivateInnerClass extends PublicInnerClass {
        private String privateText = "privateText";
    }

    public static class PublicStaticInnerClass {
        public static String staticPublicText = "staticPublicText";
        protected static String staticProtectectedText = "staticProtectectedText";
        static String staticPackageProtectectedText = "staticPackageProtectectedText";
        private static String staticPrivateText = "staticPrivateText";

        public static void publicStaticMethod(){ System.out.println("Static inner method"); }

        protected static void protectedStaticMethod() { System.out.println("Static inner method"); }

        static void packageProtectedStaticMethod(){ System.out.println("Static inner method"); }

        private static void privateStaticMethod(){ System.out.println("Static inner method"); }
    }

    /**
     * ProtectedStaticInnerClass is the same class as PublicStaticInnerClass, only with the diference of the class
     * accessor protected.
     *
     */
    protected static class ProtectedStaticInnerClass extends PublicStaticInnerClass{
        // Avoid writing duplicate code.
    }


    /**
     * PackageProtectedStaticInnerClass is the same class as PublicStaticInnerClass, only with the diference of the class
     * accessor package protected.
     *
     */
    static class PackageProtectedStaticInnerClass extends PublicStaticInnerClass {
        // Avoid writing duplicate code.
    }

    /**
     * PackageProtectedStaticInnerClass is the same class as PublicStaticInnerClass, only with the diference of the class
     * accessor private.
     *
     */
    private static class StaticPrivateInnerClass extends PublicStaticInnerClass{
        // Avoid writing duplicate code.
    }

}
