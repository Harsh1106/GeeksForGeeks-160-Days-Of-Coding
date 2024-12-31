import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static int longestConsecutive(int[] arr) {
        if(arr == null || arr.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr) set.add(num);
        int st = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int curr = num, count = 1;
                while(set.contains(curr + 1)){
                    curr += 1;
                    count += 1;
                }
                st = Math.max(st, count);
            }
        }
        return st;
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 9, 4, 5, 3};
        System.out.println(longestConsecutive(arr));
    }
}
