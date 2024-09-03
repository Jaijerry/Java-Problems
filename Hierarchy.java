class A {
    public void print1(){ System.out.println("A");}
}
class B extends A {
    public void print2(){ System.out.println("B");}
}
class C extends A {
    public void print3(){ System.out.println("C");}
}
public class Hierarchy {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        A a = new A();
        b.print2();
        b.print1();
        c.print3();
        c.print1();
        a.print1();
    }
}
