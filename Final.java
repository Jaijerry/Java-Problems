class MyFinalClass {
    void mymethod(){
        System.out.println("We are in final class");
    }
}

class subClass extends MyFinalClass { 
    void mymethod() {
        System.out.println("We are in sub class");
    }
}

class subClass1 extends MyFinalClass {
    void mymethod() {
        System.out.println("We are in sub class 1");
    }
}

class Final {
    public static void main(String args[]){
        MyFinalClass f; // Object creation
        f = new MyFinalClass(); // Object Instantiation
        f.mymethod(); // Method Invocation
        f = new subClass1();
        f.mymethod();
        f = new MyFinalClass();
        f.mymethod();
    }
}