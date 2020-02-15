package holidayWork20200215;

public class JieCheng {
    public static void main(String[] args) {
        System.out.printf("%d£¡ = %s", 10, fac(10));
    }
    
    static long fac(int n) {
        if(n == 1) {
            return 1;
        }else {
            return n * fac(n-1);
        }
    }
}
