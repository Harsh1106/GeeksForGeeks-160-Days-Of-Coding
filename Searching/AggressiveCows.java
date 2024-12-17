import java.util.Arrays;

public class AggressiveCows{
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls); 
        int low = 1; 
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2; 
            if (canPlaceCows(stalls, k, mid)) {
                ans = mid; 
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return ans;
    }
    public static boolean canPlaceCows(int[] stalls, int k, int dist) {
        int cows = 1; 
        int lastPlaced = stalls[0]; 

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPlaced >= dist) {
                cows++;
                lastPlaced = stalls[i];
            }
            if (cows == k) return true; 
        }
        return false; 
    }
    public static void main(String[] args) {
        int[] stalls = {1,2,4,8,9};
        int k = 3;
        System.out.println(aggressiveCows(stalls, k));
    }
}