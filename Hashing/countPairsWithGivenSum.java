import java.util.HashMap;
public class countPairsWithGivenSum {
    public static int countPairs(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num : arr){
            int diff = target - num;
            if(map.containsKey(diff)){
                count += map.get(diff);
                if(diff == num) count--;
            }
        }
        return count/2;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        System.out.println(countPairs(arr, target));
    }
}
