import java.util.HashSet;

public class LongestSubstringWithDistinctCharacters {
    public static int longestUniqueSubstr(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, max = 0;
        for(int i = 0 ; i < s.length() ; i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(longestUniqueSubstr(s));
    }
}
