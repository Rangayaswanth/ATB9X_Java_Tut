package Oct.Task;
import java.util.Scanner;

public class Scanner_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first_integer");
        int first_integer = scanner.nextInt();
        System.out.println("Enter the second_integer");
        int second_integer = scanner.nextInt();
        int Max_Number=(Math.max(first_integer, second_integer));
        System.out.println("first_integer: " + first_integer);
        System.out.println("second_integer: " + second_integer);
        System.out.println("Max_Number: " + Max_Number);
        scanner.close();

    }
}
