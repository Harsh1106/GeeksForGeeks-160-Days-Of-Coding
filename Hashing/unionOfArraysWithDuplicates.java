import java.util.HashSet;

public class unionOfArraysWithDuplicates {
    public static int findUnion(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : a) set.add(num);
        for(int num : b) set.add(num);
        return set.size();
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3};
        System.out.println(findUnion(a, b));
    }
}
