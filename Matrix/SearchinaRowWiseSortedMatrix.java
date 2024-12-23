import java.util.Arrays;

public class SearchinaRowWiseSortedMatrix {
    public static boolean searchRowMatrix(int[][] mat, int x){
        for(int i = 0 ; i < mat.length ; i++){
            if(Arrays.binarySearch(mat[i], x) >= 0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat = {{3,4,9},
                        {2,5,6},
                        {9,25,27}};
        int x = 9;
        System.out.println(searchRowMatrix(mat, x));
    }
}
