class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
            for (int i = 0; i < mat.length; i++) {
            if (Arrays.binarySearch(mat[i], x) >= 0) { 
                return true;
            }
        }
        return false; 
    }
}
