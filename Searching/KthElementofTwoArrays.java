public class KthElementofTwoArrays {
    public static int kthElement(int a[], int b[], int k) {
        int i = 0, j = 0, s = 0;
        int[] c = new int[a.length + b.length];
        while(i < a.length && j < b.length){
            if(a[i] < b[j]) c[s++] = a[i++];
            else c[s++] = b[j++];
        }
        while(i < a.length) c[s++] = a[i++];
        while(j < b.length) c[s++] = b[j++];
        return c[k - 1];
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;
        System.out.println(kthElement(a, b, k));
    }
}
