package ex_12092024;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Iterate {
    public static void main(String[] args) {
        List<String> MyList = new ArrayList<>();
        MyList.add("Yash");
        MyList.add("yaswan");
        MyList.add("asdf");
        MyList.add("dfg");

        System.out.println(" - To Print Arraylist -1");

        for (String str : MyList){
            System.out.println(str);
        }

        for (int i=0; i<MyList.size();i++){
            System.out.println(MyList.get(i));
        }









    }
}
