import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintAnagramsTogether {
    public static ArrayList<ArrayList<String>> anagrams(String[] arr) {
        Map<String, List<String>> ans = new HashMap<>();
        for(String s : arr){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sort = String.valueOf(ch);
            if(!ans.containsKey(sort)) ans.put(sort, new ArrayList());
            ans.get(sort).add(s);
        }
        return new ArrayList(ans.values());
    }
    public static void main(String[] args) {
        String[] arr = {"act", "god", "cat", "dog", "tac"};
        ArrayList<ArrayList<String>> res = anagrams(arr);
        for(ArrayList<String> a : res){
            for(String s : a){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
