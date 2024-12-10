package ex_12082024;

public class generic {
    public static void main(String[] args) {
        temp_sum(23,45);
        temp_sum("pramod","Dutta");
        temp_sum(true,false);



    }
    public static <T> T temp_sum(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }



}
