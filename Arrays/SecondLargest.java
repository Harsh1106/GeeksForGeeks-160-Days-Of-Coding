public class SecondLargest {
    public static int getSecondLargest(int[] arr) {
        int first = -1, second = -1;
        for(int num : arr){
            if(num > first){
                second = first;
                first = num;
            }
            else if(first != num && num > second) second = num;
        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
}