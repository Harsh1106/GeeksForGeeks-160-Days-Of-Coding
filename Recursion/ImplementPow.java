public class ImplementPow {
    static double power(double b, int e) {
        if(e == 0) return 1;
        else if(e < 0) return 1/(b * power(b, -e - 1));
        else if(e % 2 == 0){
            double c = power(b, e/2);
            return c*c;
        } 
        return b * power(b, e - 1);
    }
    public static void main(String[] args) {
        double b = 3.00000, e = 5;
        System.out.println(power(b, (int)e));
    }
}