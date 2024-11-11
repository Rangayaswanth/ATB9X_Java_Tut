package Oct.Task;

import java.util.Scanner;

public class Reverse_For_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = scanner.nextInt();
        int rev=0;
        int rem=0;

        for (int i= num1; num1 >=1 ;  )
        {

            rem = num1 % 10 ;

            rev = rev*10 + rem;

            num1 = num1/10 ;
        }
        System.out.println("Reversed Output =" + rev);

        scanner.close();}}

