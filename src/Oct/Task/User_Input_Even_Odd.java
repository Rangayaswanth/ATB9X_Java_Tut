package Oct.Task;
import java.util.Scanner;

public class User_Input_Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first_number");
        int first_number = scanner.nextInt();
        System.out.println("Enter the second_number");
        int second_number = scanner.nextInt();
        int sum= first_number+second_number;
        if (sum % 2 == 0){
            System.out.println("Number is even");

        }
        else {
            System.out.println("Number is Odd");
        }

        scanner.close();
    }

}
