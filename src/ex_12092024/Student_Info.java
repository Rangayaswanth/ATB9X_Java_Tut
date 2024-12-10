package ex_12092024;

import java.util.ArrayList;
import java.util.List;

public class Student_Info {
    public static void main(String[] args) {
        student s1 = new student("Amit", 01);
        student s2 = new student("Amit", 01);
        student s3 = new student("Amit", 01);
        List<student> mystudents=new ArrayList();
        mystudents.add(s1);
        mystudents.add(s2);
        mystudents.add(s3);
        s1.printdetails();
        s2.printdetails();
        s3.printdetails();
        System.out.println(mystudents);


    }

}
