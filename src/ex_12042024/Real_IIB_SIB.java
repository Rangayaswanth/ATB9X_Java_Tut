package ex_12042024;

public class Real_IIB_SIB {
    public static void main(String[] args) {
        ATB s1 = new ATB("Amit");
        ATB s2 = new ATB("Amit");
        ATB s3 = new ATB("yash");
        ATB s4 = new ATB("balaji");
        s1.readDocuments();
        System.out.println(ATB.courseName);
    }


}
class ATB{

    {
        System.out.println("IIB");
        System.out.println("reading from the csv");

    }
    static{
        System.out.println("Load the class, I will execute");
    }


    private String name;
    private  String phone;
    static String courseName;


    public String getName() {
        return name;
    }

    public ATB(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    void readDocuments(){
        System.out.println("Non static");
        System.out.println(courseName);
    }

}