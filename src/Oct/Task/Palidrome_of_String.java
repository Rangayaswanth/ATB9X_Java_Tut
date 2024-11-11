package Oct.Task;

import java.util.Scanner;

public class Palidrome_of_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Text");
        String str = scanner.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("palidrome");
        } else {
            System.out.println("not palidrome");
        }
        System.out.println(rev);
    }
}
