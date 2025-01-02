import java.util.HashMap;

public class SubarraysWithSumK {
    public static int countSubarrays(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int c = 0, psum = 0;
        map.put(0,1);
        for(int num : arr){
            psum += num;
            if(map.containsKey(psum - k)){
                c += map.get(psum - k);
            }
            map.put(psum, map.getOrDefault(psum, 0) + 1);
        }
        return c;
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        System.out.println(countSubarrays(arr, k));
    }
}
