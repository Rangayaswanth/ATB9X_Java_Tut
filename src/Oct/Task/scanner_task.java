package Oct.Task;
import java.util.Scanner;
public class scanner_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name");
        String Name = scanner.nextLine();
        System.out.println("Enter the Age");
        int Age = scanner.nextInt();
        System.out.println("Enter the Salary");
        int Salary = scanner.nextInt();
        //String Name = scanner.nextLine();
        //int Age = scanner.nextInt();
        //int Salary = scanner.nextInt();
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Salary: " + Salary);


        scanner.close();








    }


}
