import java.util.Scanner;

class Helper {
    String name;
    int age;
    Scanner sc = new Scanner(System.in);
    void display(){
        System.out.println(name + age);
    }
    void get(){
        name=sc.next();
        age=sc.nextInt();
    }
}

public class Method {
    public static void main(String[] args) {
        Helper h = new Helper();
        h.get();
        h.display();
    }
}
