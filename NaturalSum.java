import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("Enter limit: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}
