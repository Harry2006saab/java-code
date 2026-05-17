class Animal {

    void eat() {
        System.out.println("Animal Eats");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog Barks");
    }
}

class Puppy extends Dog {

    void weep() {
        System.out.println("Puppy Weeps");
    }
}

public class MultiLevel {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();
    }
}