public class StaticExample {
    static int staticVar = 10;
    int nonStaticVar = 20;
    static void staticMethod() {
        final int a=10;
        //a=a*10; final value cannot be changed
        System.out.println("a= " + a);
        System.out.println("This is a static method");
    }

    void nonStaticMethod() {
        System.out.println("Thsi is a non static method");
    }

    public static void main(String[] args) {
        System.out.println("Static Variable: " + staticVar);
        staticMethod();
        StaticExample instance = new StaticExample();
        System.out.println("Non- Static Variable: " + instance.nonStaticVar);
        instance.nonStaticMethod();
    }
}