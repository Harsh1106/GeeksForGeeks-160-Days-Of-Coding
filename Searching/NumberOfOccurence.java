import java.util.Map;
import java.util.HashMap;
public class NumberOfOccurence {
    static int countFreq(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey() == target){
                return entry.getValue();
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,3};
        int target = 2;
        System.out.println(countFreq(arr, target));
    }
}