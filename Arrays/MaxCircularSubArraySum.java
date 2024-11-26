public class MaxCircularSubArraySum{
    public static int circularSubarraySum(int arr[]) {
        int max = kadane(arr), total = 0;
        for(int i = 0 ; i < arr.length ; i++){
            total += arr[i];
            arr[i] = -arr[i];
        }
        int circular = total + kadane(arr);
        return circular  == 0 ? max : Math.max(max, circular);
    }
    private static int kadane(int[] arr){
        int max = arr[0], maxEnding = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            max = Math.max(max, maxEnding);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(circularSubarraySum(arr));
    }
}