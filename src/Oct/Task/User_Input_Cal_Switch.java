package Oct.Task;
import java.util.Scanner;

public class User_Input_Cal_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = scanner.nextInt();
        System.out.println("Enter the num2");
        int num2 = scanner.nextInt();
        System.out.println("enter the operator :");
        char op = scanner.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("enter only +,-,*,/,% to perform operation");
                break;
        }

    }
}

