public class SearchinRotatedSOrtedArray {
    static int search(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = high + (low - high)/2;
            if(arr[mid] == key)
                return mid;
            if(arr[mid] >= arr[low]){
                if(arr[low] <= key && key < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1; 
            }
            else{
                if(arr[mid] < key && key <= arr[high])
                    low = mid + 1;
                else
                    high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;
        System.out.println(search(arr, key));
    }
}
