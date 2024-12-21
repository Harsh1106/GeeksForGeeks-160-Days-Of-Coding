public class RoateBy90Degree {
    static void rotateby90(int mat[][]) {
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = i ; j < mat.length ; j++){
                swap(mat, i, j);
            }
        }
        for(int i = 0 ; i < (mat.length/2) ; i++){
            for(int j = 0 ; j < mat.length ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[mat.length - i - 1][j];
                mat[mat.length - i - 1][j] = temp;
            }
        }
    }
    static void swap(int mat[][], int i, int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
        rotateby90(mat);
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat.length ; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
