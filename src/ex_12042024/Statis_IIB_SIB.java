package ex_12042024;

public class Statis_IIB_SIB {
    public static void main(String[] args) {


        new A();
        //new A();


    }


}


class A{

    {
        System.out.println("IIB");

    }

    static {
        System.out.println("SIB");
    }

}