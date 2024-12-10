package ex_12092024;

import java.util.*;

public class SET {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set rhs= new TreeSet();

        hs.add("pramod");
        hs.add("yaswanth");
        hs.add("YASWANTH");
        System.out.println(hs);

        lhs.add("pramod");
        lhs.add("yaswanth");
        System.out.println(lhs);

        rhs.add("pramod");
        rhs.add("yaswanth");
        System.out.println(rhs);

    }



}
