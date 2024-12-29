import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class intersectionOfTwoSortedArrays {
    public static ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        ArrayList<Integer> al = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : a){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < b.length; i++) {
            if (map.containsKey(b[i])){
                if(!al.contains(b[i])) al.add(b[i]);
            }
        }
        Collections.sort(al);
        return al;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 1};
        int[] b = {3, 1, 3, 4, 1};
        System.out.println(intersectionWithDuplicates(a, b));
    }
}
