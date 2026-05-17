import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        double avg = sum / 5.0;

        System.out.println("Average = " + avg);
    }
}