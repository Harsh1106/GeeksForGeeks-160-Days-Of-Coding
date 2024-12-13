public class SortedandRotatedMinimum {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        System.out.println(findMin(arr));
    }
}
