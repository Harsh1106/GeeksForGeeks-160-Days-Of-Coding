public class MoveAllZeroesToEnd {
    public static void moveZeros(int[] arr){
        int n = arr.length, count = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count++] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,3,0,5,0};
        moveZeros(arr);
        for(int i = 0 ; i < arr.length ; i++){ 
            System.out.print(arr[i]+" ");
        }
    }
}
