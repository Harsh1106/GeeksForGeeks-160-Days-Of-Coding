// import java.util.Arrays;

public class Sort0s1s2s {
    public static void sort012(int[] arr) {
        // Arrays.sort(arr);
        int n = arr.length, l = 0, h = n - 1, mid = 0;
        while (mid <= h) {
            if (arr[mid] == 0) {
                swap(arr, mid, l);
                l++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else {
                swap(arr, mid, h);
                h--;
            }
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        sort012(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}