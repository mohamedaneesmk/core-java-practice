package misc;

class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
}
public class GenericsDemo {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.set("Hello");
        System.out.println(b.get());
    }
}

