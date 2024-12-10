package Dec.ex_Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RealEx_MAAP {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap();
        student1.put("name","Diwakar");
        student1.put("phone number","9877477200");
        student1.put("address","JPT");
        System.out.println(student1);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich");
        book_read_items.add("dad");
        book_read_items.add("dad");
        book_read_items.add("poor");
        book_read_items.add("Rich");

        System.out.println(book_read_items);


    }
}
