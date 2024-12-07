package ex_12072024;

public class example_wrap {
    public static void main(String[] args) {
        int a = 10;
        Integer b=a;
        System.out.println(Integer.max(a,b));
        System.out.println(Integer.MAX_VALUE);
        b.intValue();


        String numb="10";
        Integer a2 = Integer.valueOf(numb);
        int a4=a2;

        //String to primitive
        int a3 = Integer.parseInt(numb);


        String num="15";
        Integer num2 = Integer.valueOf(num);
        int num3 =num2;



    }


}
