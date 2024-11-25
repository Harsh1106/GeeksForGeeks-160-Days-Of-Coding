public class MaximumProductSubarray {
    static int maxProduct(int[] arr) {
        if(arr.length == 0) return 0;
        int max = arr[0], minProd = arr[0], maxProd = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] < 0){
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(arr[i], arr[i] * maxProd);
            minProd = Math.min(arr[i], arr[i] * minProd);
            
            max = Math.max(max, maxProd);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(arr));
    }
}
