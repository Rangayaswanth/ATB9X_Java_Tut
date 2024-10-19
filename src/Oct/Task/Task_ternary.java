package Oct.Task;

public class Task_ternary {
    public static void main(String[] args) {
        int age=15;
        int number=20;
        int people = 25;
        String result = (age>number?"age is greater":"number is greater");
        int result2 = age > number? age : number;
        int result3 = people > result2? people : result2;
        //System.out.println(result);
      //  System.out.println(result2);
        System.out.println(result3);
    }
}
