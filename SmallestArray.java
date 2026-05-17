import java.util.Scanner;

public class SmallestArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int small = arr[0];

        for(int i = 1; i < 5; i++) {
            if(arr[i] < small) {
                small = arr[i];
            }
        }

        System.out.println("Smallest Number = " + small);
    }
}