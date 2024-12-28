import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllTripletsWithZeroSum {
    public static List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> al = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                for(int k = j + 1 ; k < arr.length ; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> triplet = Arrays.asList(i,j,k);
                        if(!al.contains(triplet)) al.add(triplet);
                    }
                }
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        System.out.println(findTriplets(arr));
    }
}
