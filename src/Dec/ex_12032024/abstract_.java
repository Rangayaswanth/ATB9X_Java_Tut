package Dec.ex_12032024;

public class abstract_ {
    public static void main(String[] args) {
        child C = new child();
        C.loan50k();;
        C.loan25k();

    }


}






class child extends Father {
    @Override
    void loan50k() {
        System.out.println("Child is giving the loan");

    }
}








abstract class Father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("Done by father");
    }

}
