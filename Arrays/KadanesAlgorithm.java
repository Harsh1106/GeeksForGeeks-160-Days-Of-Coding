public class KadanesAlgorithm {
    static int maxSubarraySum(int[] arr) {
        int res = arr[0], curr = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            curr = Math.max(arr[i]+curr, arr[i]);
            res = Math.max(res, curr);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        System.out.println(maxSubarraySum(arr));
    }
}
