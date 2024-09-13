import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong(), b = sc.nextLong();
            long c = gcd(a, b);
            
            if (c == 0)
                c = 1;
            
            System.out.println(a * b / c);
        }
    }

    public static long gcd(long a, long b) {
        if (a < b) {
            long t = a;
            a = b;
            b = t;
        }
        
        while (b > 0) {
            a = a % b;
            if (a < b) {
                long t = a;
                a = b;
                b = t;
            }
        }
        
        return a;
    }
}