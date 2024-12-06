import java.util.Arrays;

public class FindHIndex {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int hIdx = 0;
        for(int i = 0 ; i < citations.length ; i++){
            int h = citations.length - i;
            if(citations[i] >= h){
                hIdx = h;
                break;
            }
        }
        return hIdx;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,5,3,0};
        System.out.println(hIndex(arr));
    }
}
