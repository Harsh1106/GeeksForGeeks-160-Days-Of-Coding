import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class MajorityElement2{
    public static List<Integer> findMajority(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> al = new ArrayList<>();
        int n = nums.length;
        int c = n/3;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > c) al.add(entry.getKey());
        }
        return al;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        ArrayList<Integer> al = new ArrayList<>(findMajority(arr));
        System.out.println(al);
    }
}