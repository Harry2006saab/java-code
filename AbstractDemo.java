abstract class User {

    abstract void login();

    void display() {
        System.out.println("User Information");
    }
}

class Student extends User {

    void login() {
        System.out.println("Student Login Successful");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        Student s = new Student();

        s.display();
        s.login();
    }
}