package Dec.ex_Map;

import java.util.HashMap;
import java.util.Map;

public class MAP_P3 {
    public static void main(String[] args) {
        Map<String,Object> student2 = new HashMap();
        student2.put("id",5);
        student2.put("id2",52);
        student2.put("id3",15);
        student2.put("id4",35);

        for(Map.Entry<String,Object>item:student2.entrySet()){
            System.out.println(item.getKey() + "->" + item.getValue());

        }


    }
}
