package ex_12052024;

public class Exceptions {
    public static void main(String[] args) {
        int a=0;
        int c= 0;
        try {
            c = 10/a;
            System.out.println(c);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("I will be always executed");
        }

    }


}
