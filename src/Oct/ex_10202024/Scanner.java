package Oct.ex_10202024;

public class Scanner { // Renamed to avoid conflict
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in); // Fully qualified class name
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        System.out.println(age > 25 ? "allowed" : "Not allowed");
        scanner.close();
    }
}
