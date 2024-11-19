public class NextPermutation {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void rev(int[] arr, int start){
        int i = start, j =arr.length - 1;
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    static void nextPermutation(int[] arr){
        int idx = -1, idx2 = -1, n = arr.length;
        for(int i = n - 2 ; i >= 0 ; i--){
            if(arr[i] < arr[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            rev(arr, 0);
        }
        else{
            for(int i = n - 1 ; i >= idx ; i--){
                if(arr[i] > arr[idx]){
                    idx2 = i;
                    break;
                }
            }
            swap(arr, idx, idx2);
            rev(arr, idx + 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 0};
        nextPermutation(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
