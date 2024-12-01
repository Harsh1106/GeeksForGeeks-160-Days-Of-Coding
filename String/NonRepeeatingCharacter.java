import java.util.HashMap;
public class NonRepeeatingCharacter{
    static char nonRepeatingChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(char ch : s.toCharArray()){
            if(map.get(ch) == 1) return ch;
        }
        return '$';
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(nonRepeatingChar(str));
    }
}