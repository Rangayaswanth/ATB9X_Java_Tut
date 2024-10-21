//package Oct.Task;
//import java.util.Scanner;
//
//public class If_ElseIF_Grade {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the Number");
//        int Number = scanner.nextInt();
//        if (Number>100){
//            System.out.println("Entered number is not correct");
//        }else if(Number>=90 && Number<=100){
//            System.out.println("A");
//        } else if (Number>=80 && Number<=90) {
//            System.out.println("B");
//
//        }else if (Number>=70 && Number<=80) {
//            System.out.println("c");
//        }
//        else{
//            System.out.println("D");
//
//        }
//    scanner.close();
//    }
//}
package Oct.Task;
import java.util.Scanner;

public class If_ElseIF_Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number (0 - 100):");
        int Number = scanner.nextInt();

        // Check if the input number is within the valid range
        if (Number < 0 || Number > 100) {
            System.out.println("Error: Please enter a number between 0 and 100.");
        } else {
            if (Number >= 90) {
                System.out.println("A");
            } else if (Number >= 80) {
                System.out.println("B");
            } else if (Number >= 70) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        }

        scanner.close();
    }
}
