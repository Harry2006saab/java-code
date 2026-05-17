class Person {

    void show() {
        System.out.println("This is Person Class");
    }
}

class Student extends Person {

    void display() {
        System.out.println("This is Student Class");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {

        Student s = new Student();

        s.show();
        s.display();
    }
}