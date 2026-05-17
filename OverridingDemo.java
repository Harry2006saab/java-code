class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat Meows");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {

        Cat c = new Cat();

        c.sound();
    }
}