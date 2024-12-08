package Main_Example;

public class runner_Bank {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank(100, "INR");
        Bank icici = new Bank(1000, "INR");
        Bank axis = new Bank(10000, "INR");
        System.out.println(sbi.add(icici));


        Bank jp_chase = new Bank(100, "USD");
        System.out.println(sbi.add(jp_chase));


    }
}
