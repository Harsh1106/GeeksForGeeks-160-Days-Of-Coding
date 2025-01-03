import java.util.HashMap;

public class CountSubArraysWithGivenXOR {
    public static long subarrayXor(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0, pXor = 0;
        map.put(0,1);
        for(int i : arr){
            pXor ^= i;
            int rXor = pXor ^ k;
            if(map.containsKey(rXor)){
                count += map.get(rXor);
            }
            map.put(pXor, map.getOrDefault(pXor, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(subarrayXor(arr, k));
    }
}
