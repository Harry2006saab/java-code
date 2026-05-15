class Student {
    private String name;
    private int number;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}

public class Student {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Harjot Singh");
        s1.setNumber(101);

        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Number: " + s1.getNumber());
    }
}