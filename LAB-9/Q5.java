class Container<T> {
    private T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static <T> void swap(Container<T> c1, Container<T> c2) {
        T temp = c1.getValue();
        c1.setValue(c2.getValue());
        c2.setValue(temp);
    }
}

public class Q5 {
    public static void main(String[] args) {

        Container<String> c1 = new Container<>("Hello");
        Container<String> c2 = new Container<>("World");

        System.out.println("Before swap:");
        System.out.println("c1 = " + c1.getValue());
        System.out.println("c2 = " + c2.getValue());

        Container.swap(c1, c2);

        System.out.println("After swap:");
        System.out.println("c1 = " + c1.getValue());
        System.out.println("c2 = " + c2.getValue());

        Container<Integer> n1 = new Container<>(10);
        Container<Integer> n2 = new Container<>(20);

        System.out.println("\nBefore swap:");
        System.out.println("n1 = " + n1.getValue());
        System.out.println("n2 = " + n2.getValue());

        Container.swap(n1, n2);

        System.out.println("After swap:");
        System.out.println("n1 = " + n1.getValue());
        System.out.println("n2 = " + n2.getValue());
    }
}