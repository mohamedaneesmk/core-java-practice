abstract class Animal {
    abstract void sound();
}
class Cat extends Animal {
    void sound() { System.out.println("Meow"); }
}
public class AbstractClassDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();
    }
}
