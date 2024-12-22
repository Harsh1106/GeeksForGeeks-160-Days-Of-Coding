public class SearchinaRowColumnSortedMatrix {
    public static boolean matSearch(int mat[][], int x) {
        int m = mat.length, n = mat[0].length;
        int row = 0, col = n - 1;
        while(row < m && col >= 0){
            if(mat[row][col] == x) return true;
            else if(mat[row][col] > x) col--;
            else row++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat = {{3, 30, 38},
                        {20, 52, 54},
                        {35, 60, 69}};
        int x = 62;
        System.out.println(matSearch(mat, x));
    }
}