import java.util.Scanner;

public class TableProgram {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== TABLE PROGRAM =====");
            System.out.println("1. Print Single Table");
            System.out.println("2. Print Multiple Tables");
            System.out.println("3. Print Tables in Range");
            System.out.println("4. Print Table in Grid Format");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printSingleTable();
                    break;
                case 2:
                    printMultipleTables();
                    break;
                case 3:
                    printRangeTables();
                    break;
                case 4:
                    printGridTable();
                    break;
                case 5:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);
    }

    // 1️⃣ Print Single Table
    public static void printSingleTable() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("\nTable of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // 2️⃣ Print Multiple Tables
    public static void printMultipleTables() {
        System.out.print("Enter how many tables: ");
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("\nTable of " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

    // 3️⃣ Print Tables in Range
    public static void printRangeTables() {
        System.out.print("Enter start number: ");
        int start = sc.nextInt();

        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println("\nTable of " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

    // 4️⃣ Print Grid Table (1 to 10)
    public static void printGridTable() {
        System.out.println("\nMultiplication Table Grid (1 to 10)\n");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
