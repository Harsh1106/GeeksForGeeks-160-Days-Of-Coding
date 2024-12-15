public class PeakElement {
    public static int peakElement(int[] arr){
        int low = 0, high = arr.length - 1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(arr[mid] < arr[mid + 1]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        int res = peakElement(arr);
        if(res > 0) System.out.println("true");
        else System.out.println("false");
    }
}
