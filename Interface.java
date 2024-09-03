interface in {  
    void methodone();
}

interface in1 {
    void methodtwo();
}
class myClass implements in, in1{
    public void methodone(){
        System.out.println("Implement method one");
    }
    public void methodtwo(){
        System.out.println("Implementing method two");
    }
    public void myClassMethod(){
        System.out.println("My class specific method");
    }
    myClass(){
        System.out.println("Running myclass...");
    }
}

public class Interface {
    public static void main(String[] args) {
        myClass a = new myClass();
        a.methodone();
        a.methodtwo();
        a.myClassMethod();
    }
}
