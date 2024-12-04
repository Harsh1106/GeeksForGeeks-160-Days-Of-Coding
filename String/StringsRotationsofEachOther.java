public class StringsRotationsofEachOther {
    public static boolean areRotations(String s1, String s2) {
        s1 = s1 + s1;
        return s1.lastIndexOf(s2) > 0;
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(areRotations(s1, s2));
    }
}
