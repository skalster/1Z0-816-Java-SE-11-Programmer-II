package _1_java_fundamentals.another;

import _1_java_fundamentals.NestedClasses;

public class AnotherClassInAnotherPackage {
    NestedClasses nestedClasses = new NestedClasses();

    public void method(){
        NestedClasses.InnerClassPublic a = nestedClasses.new InnerClassPublic();
        System.out.println(a.nc);
        System.out.println(a.publicText);

    }
}
