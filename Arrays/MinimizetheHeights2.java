import java.util.Arrays;
public class MinimizetheHeights2{
    static int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int ans = arr[arr.length - 1] - arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i]  - k < 0) continue;
            int minH = Math.min(arr[0] +  k,arr[i] - k);
            int maxH = Math.max(arr[i - 1] + k, arr[arr.length - 1] - k);
            ans = Math.min(ans, maxH - minH);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,8,10};
        int k = 2;
        System.out.println(getMinDiff(arr, k));
    }
}