import java.util.LinkedList;
import java.util.Queue;

public class RotateArray {
    public static void rotate(int[] arr, int d){
        int m = d % arr.length;
        Queue<Integer> queue = new LinkedList<>();
        int i = 0;
        while(i < m){
            queue.add(arr[i++]);
        }
        int j = 0;
        while(i < arr.length){
            arr[j++] =  arr[i++];
        }
        while(!queue.isEmpty()){
            arr[j++] = queue.poll();
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 2;
        rotate(arr, d);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
