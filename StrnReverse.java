import java.util.Scanner;

public class StrnReverse{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str, rev = "";

        System.out.print("Enter String: ");
        str = sc.nextLine();

        for(int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reverse String = " + rev);
    }
}