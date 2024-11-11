package Oct.Task;
import java.util.Scanner;
public class Add_Mul_Div_Sub_Functions {

    // Method for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Method for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method for subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method for division
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int first_integer = scanner.nextInt();
        System.out.println("Enter the second integer:");
        int second_integer = scanner.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Multiply");
        System.out.println("3. Subtract");
        System.out.println("4. Divide");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + add(first_integer, second_integer));
                break;
            case 2:
                System.out.println("Result: " + multiply(first_integer, second_integer));
                break;
            case 3:
                System.out.println("Result: " + subtract(first_integer, second_integer));
                break;
            case 4:
                System.out.println("Result: " + divide(first_integer, second_integer));
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }



        scanner.close();
    }
}
