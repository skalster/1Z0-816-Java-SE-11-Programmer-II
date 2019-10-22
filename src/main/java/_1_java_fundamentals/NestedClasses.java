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

    {
        // variables
        System.out.println(InnerClassStaticPrivate.staticPrivateText);
        // Methods
        InnerClassStaticPrivate.privateStaticMethod();
        InnerClassStaticPrivate.publicStaticMethod();
    }

    private String text; // Not accessible (or visible) from inner classes.
    private final String finalText = "finalText"; // Accessible from InnerClasses as is final.
    private NestedClasses.InnerClassProtected protectedClazzField = this.new InnerClassProtected();

    public NestedClasses() {
        usingPublicNestedClass();

        usingProtectedNestedClass();

        usingPackageProtectedNestedClass();

        usingPrivateNestedClass();
    }

    public void usingPublicNestedClass() {
        NestedClasses nestedClazz = new NestedClasses();

        // Public
        NestedClasses.InnerClassPublic clazz = this.new InnerClassPublic();
        NestedClasses.InnerClassPublic clazz2 = nestedClazz.new InnerClassPublic();

        // InnerClassPublic variables
        clazz.privateText = "ModifyingOuterMethod";
        clazz.publicText = "ModifyingOuterMethod";

        // InnerClassPublic methods
        clazz.innerPublicMethod();
        clazz.innerProtectedMethod();
        clazz.innerPackageProtectedMethod();
        clazz.innerPrivateMethod();


    }

    public void usingProtectedNestedClass(){
        NestedClasses nestedClazz = new NestedClasses();
        // Protected
        NestedClasses.InnerClassProtected protectedClazz = this.new InnerClassProtected();
        NestedClasses.InnerClassProtected protectedClazz2 = nestedClazz.new InnerClassProtected();

        protectedClazz.privateText = "";
        protectedClazz.publicText = "";


    }

    public void usingPackageProtectedNestedClass(){
        NestedClasses nestedClazz = new NestedClasses();
        // Protected
        NestedClasses.InnerClassPackageProtected classPackageProtected = this.new InnerClassPackageProtected();
        NestedClasses.InnerClassPackageProtected protectedClazz2 = nestedClazz.new InnerClassPackageProtected();

        classPackageProtected.privateText = "";
        classPackageProtected.publicText = "";


    }

    public void usingPrivateNestedClass(){
        NestedClasses nestedClazz = new NestedClasses();
        // Private
        NestedClasses.InnerClassProtected protectedClazz = this.new InnerClassProtected();
        NestedClasses.InnerClassProtected protectedClazz2 = nestedClazz.new InnerClassProtected();

        protectedClazz.privateText = "";
        protectedClazz.publicText = "";


    }

    public void usingStaticNestedClass(){
        NestedClasses nestedClazz = new NestedClasses();
        // Protected
        NestedClasses.InnerClassProtected protectedClazz = this.new InnerClassProtected();
        NestedClasses.InnerClassProtected protectedClazz2 = nestedClazz.new InnerClassProtected();

        protectedClazz.privateText = "";
        protectedClazz.publicText = "";


    }

    public class InnerClassPublic {
        private String privateText;
        public String publicText;
        public NestedClasses nc = new NestedClasses();

        public InnerClassPublic() {
            privateText = "constructorPrivateText";
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

    protected class InnerClassProtected {
        private String privateText;
        public String publicText;
    }

    class InnerClassPackageProtected {
        private String privateText;
        public String publicText;
    }

    private class InnerClassPrivate {
        private String privateText;
        public String publicText;
    }

    private static class InnerClassStaticPrivate {
        public static String staticPublicText;
        private static String staticPrivateText;

        // OuterClass.StaticNestedClass nestedObject =
        //     new OuterClass.StaticNestedClass();
        public static void publicStaticMethod(){
            System.out.println("Static inner method");
        }
        private static void privateStaticMethod(){
            System.out.println("Static inner method");
        }
    }

}
