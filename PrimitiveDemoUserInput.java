import java.util.Scanner;

class PrimitiveDemoUserInput {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter an integer value: ");
        int number = sc.nextInt();

        // Taking float input
        System.out.print("Enter a float value: ");
        float decimalNumber = sc.nextFloat();

        // Taking character input
        System.out.print("Enter a character: ");
        char letter = sc.next().charAt(0);

        // Taking boolean input
        System.out.print("Enter a boolean value (true/false): ");
        boolean status = sc.nextBoolean();

        // Displaying values
        System.out.println("\n--- Output ---");
        System.out.println("Integer value: " + number);
        System.out.println("Float value: " + decimalNumber);
        System.out.println("Character value: " + letter);
        System.out.println("Boolean value: " + status);

        sc.close();
    }
}