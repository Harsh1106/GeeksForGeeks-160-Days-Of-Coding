import java.util.Arrays;
public class Anagram {
    public static boolean areAnagrams(String s1, String s2) {
        char[] strArray1 = s1.toCharArray();
        char[] strArray2 = s2.toCharArray();
        Arrays.sort(strArray1);
        Arrays.sort(strArray2);
        if(strArray1.length != strArray2.length) return false;
        for(int i = 0 ; i < strArray1.length ; i++){
            if(strArray1[i] != strArray2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "geeks";
        String str2 = "kseeg";
        System.out.println(areAnagrams(str1, str2));
    }
}
