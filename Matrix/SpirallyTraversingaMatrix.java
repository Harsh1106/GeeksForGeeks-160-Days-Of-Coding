import java.util.ArrayList;
public class SpirallyTraversingaMatrix {
    public static ArrayList<Integer> spirallyTraverse(int arr[][]) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;
        while(left <= right && top <= bottom){
            for(int i = left ; i <= right ; i++){
                al.add(arr[top][i]);
            }
            top++;
            for(int i = top ; i <= bottom ; i++){
                al.add(arr[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i = right ; i >= left ; i--){
                    al.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom ; i >= top ; i--){
                    al.add(arr[i][left]);
                }
                left++;
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        System.out.println(spirallyTraverse(arr));
    }
}