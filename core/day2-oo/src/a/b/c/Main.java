package a.b.c;

class Base {
    public void foo(Base bObj) {   //overriding ka scene nhi h
        System.out.println("In Base.foo()");
        bObj.bar();
    }
    public static void bar() {
        System.out.println("In Base.bar()");
    }
}
class Derived extends Base {

    public void foo(Derived bObj) {    //overriding ka scene nhi h aur Base ka object pass horha h foo mei
        System.out.println("In Derived.foo()");
        bObj.bar();
    }
    public static void bar() {
        System.out.println("In Derived.bar()");
    }
}
public class Main {
    public static void main(String[] args) {
        Base bObj = new Derived(); // Base ka pointer liya aur Derived ka object liya
        bObj.foo(bObj);
    }
}