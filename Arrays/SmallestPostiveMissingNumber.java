import java.util.Arrays;

public class SmallestPostiveMissingNumber {
    public static int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int res = 1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == res) res++;
            else if(arr[i] > res) break;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2, -3, 4, 1, 1, 7};
        System.out.println(missingNumber(arr));
    }
}
