package _1_java_fundamentals.another;

import _1_java_fundamentals.NestedClasses;

public class InheritFromNestedClass extends NestedClasses {
    public void useNestedClasses(){
        NestedClasses.PublicInnerClass publicClazz = this.new PublicInnerClass();

//        No good explanation for this case. I can see it, but not create the instance.
        NestedClasses.ProtectedInnerClass protectedInnerClass = this.new ProtectedInnerClass();
        NestedClasses.ProtectedInnerClass a = null;
        System.out.println(a.nc);;
        System.out.println(a.publicText);;

        NestedClasses.ProtectedStaticInnerClass.publicStaticMethod();

    }
}
