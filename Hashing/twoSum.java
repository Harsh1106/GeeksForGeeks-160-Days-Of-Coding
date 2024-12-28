import java.util.HashMap;

public class twoSum{
    static boolean twoSumFind(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            int val = target - arr[i];
            if(map.containsKey(val)) return true;
            map.put(arr[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 16;
        System.out.println(twoSumFind(arr, target));
    }
}