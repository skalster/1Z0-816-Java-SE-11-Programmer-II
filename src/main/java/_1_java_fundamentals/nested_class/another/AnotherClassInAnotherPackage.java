package _1_java_fundamentals.nested_class.another;

public class AnotherClassInAnotherPackage {
    NestedClasses nestedClasses = new NestedClasses();

    public void method(){
        NestedClasses.PublicInnerClass publicInnerClass = nestedClasses.new PublicInnerClass();

        //innerProtectedMethod is not visible from this class.

        // innerPackageProtectedMethod is not visible from this class.

        // innerPrivateMethod is not visible from this class.

        System.out.println(publicInnerClass.nc);
        System.out.println(publicInnerClass.publicText);

    }
}
