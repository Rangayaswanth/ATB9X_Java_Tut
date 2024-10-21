package Oct.Task;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number Side-1");
        int Side_1 = scanner.nextInt();
        System.out.println("Enter the Number Side-2");
        int Side_2 = scanner.nextInt();
        System.out.println("Enter the Number Side-3");
        int Side_3 = scanner.nextInt();
        if(Side_1==Side_2 && Side_2==Side_3){
            System.out.println("Equaletral triangle");
        } else if (Side_1 == Side_2 || Side_2 == Side_3 || Side_3 == Side_1) {
            System.out.println("It is isosceles traingle");
            
        }else {
            System.out.println("riangle is scalene Triangle");
        }


    }

}
