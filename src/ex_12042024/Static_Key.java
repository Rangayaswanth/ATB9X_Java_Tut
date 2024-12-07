package ex_12042024;

public class Static_Key {
    public static void main(String[] args) {
        student s1 = new student(23);
        student s2 = new student(33);

      //s1.school_name;
       // int age = s1.age;
        System.out.println(student.school_name);
        System.out.println(s1.age);



    }


}

class student{
    int age;
    static String school_name="ABC";

    {
        System.out.println("IIB");
    }
    static {
        System.out.println("SIB");
    }


    public student(int age) {
        this.age = age;
    }
}



