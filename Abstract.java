abstract class Bike {
    Bike() {System.out.println("Bike is created");}
    abstract void run();
    void changeGear() {System.out.println("Gear is changed");}
}
class Honda extends Bike{
    void run() {System.out.println("running safely...");}
}
public class Abstract {
    public static void main(String[] args) {
        Bike o = new Honda();
        o.run();
        o.changeGear();
    }
}
