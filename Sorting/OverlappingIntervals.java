import java.util.*;
public class OverlappingIntervals {
    public static List<int[]> mergeOverlap(int[][] arr) {
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> list = new LinkedList<>();
        for(int[] interval : arr){
            if(list.isEmpty() || list.getLast()[1] < interval[0]){
                list.add(interval);
            }
            else{
                list.getLast()[1] = Math.max(list.getLast()[1], interval[1]);
            }
        }
        return new ArrayList<>(list);
    }
    public static void main(String[] args) {
        int[][] arr = {{1,3}, {2,4}, {6,8}, {9,10}};
        System.out.println(mergeOverlap(arr));
    }
}
