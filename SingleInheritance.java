class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Animal a = new Animal();
        a.eat();
        myDog.bark();
        myDog.eat();
    }
}
