import java.util.*;
class PermutationsOfAString{
    private static void recurPermute(char[] ch, List<Character> ds, ArrayList<String> ans, boolean[] freq){
        if(ds.size() == ch.length){
            StringBuilder p = new StringBuilder();
            for(char c : ds) p.append(c);
            ans.add(p.toString());
            return;
        }
        for(int i = 0 ; i < ch.length ; i++){
            if(!freq[i]){
                if(i > 0 && ch[i] == ch[i - 1] && !freq[i - 1]) continue;
                freq[i] = true;
                ds.add(ch[i]);
                recurPermute(ch, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
    public static ArrayList<String> findPermutation(String s) {
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        ArrayList<String> ans = new ArrayList<>();
        List<Character> ds = new ArrayList<>();
        boolean[] freq = new boolean[s.length()];
        recurPermute(sArr, ds, ans, freq);
        return ans;
    }
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(findPermutation(str));
    }
}