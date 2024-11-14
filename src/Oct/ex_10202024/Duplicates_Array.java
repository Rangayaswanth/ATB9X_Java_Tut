package Oct.ex_10202024;
import java.util.Arrays;
import java.util.Scanner;

public class Duplicates_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];


        for(int i = 0; i < size; i++) {
            System.out.println("Enter the element at index " + i + ":");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element found: " + arr[i]);
                }
            }
        }
        scanner.close();
    }
}
