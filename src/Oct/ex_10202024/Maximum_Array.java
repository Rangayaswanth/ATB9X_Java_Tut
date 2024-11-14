package Oct.ex_10202024;

import java.util.Arrays;

public class Maximum_Array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
}
