package _1_java_fundamentals.nested_class.another;

public class UserOfNestedClass {

    public void methodUse(){
        NestedClasses nestedClasses = new NestedClasses();
        NestedClasses.PublicInnerClass innerPublicClass = nestedClasses.new PublicInnerClass();

        NestedClasses.ProtectedInnerClass innerProtectedClass = nestedClasses.new ProtectedInnerClass();

//        This can NOT be used and will generate a compile error.
//        NestedClasses.ProtectedInnerClass innerProtectedClass = this.new ProtectedInnerClass();

        NestedClasses.PackageProtectedInnerClass innerPackageProtectedClass =
                nestedClasses.new PackageProtectedInnerClass();

        // Inner Private Class is not visible from this class.

    }

    // Static methods
    public void useStaticMethods(){
        NestedClasses.PublicStaticInnerClass.publicStaticMethod();

        NestedClasses.ProtectedStaticInnerClass.publicStaticMethod();

        NestedClasses.PackageProtectedStaticInnerClass.publicStaticMethod();

        // Inner Static Private Class is not visible from this class.
    }

    // Static variables
    public void useStaticVariables(){
        System.out.println(NestedClasses.PublicStaticInnerClass.staticPublicText);
        System.out.println(NestedClasses.PublicStaticInnerClass.staticProtectectedText);
        System.out.println(NestedClasses.PublicStaticInnerClass.staticPackageProtectectedText);
        // The variable staticPrivateText is not visible from outside the class NestedClasses.
    }
}
