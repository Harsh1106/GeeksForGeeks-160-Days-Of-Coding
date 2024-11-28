public class ImplementAtoi{
    public static int myAtoi(String s) {
        int len = s.length(), sign = 1, ans = 0;
        int i = 0;
        while (i < len && s.charAt(i) == ' ') i++;
        
        if (i < len && (s.charAt(i) == '-' || s.charAt(i) == '+')) {    
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < len && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';
            
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            ans = ans * 10 + digit;
            i++;
        }

        return sign * ans;
    }
    public static void main(String[] args) {
        String s = "-123";
        System.out.println(myAtoi(s));
    }
}
