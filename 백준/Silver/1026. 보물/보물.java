import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] a = new int[n];
        int[] b = new int[n];
        
        String[] strA = br.readLine().split(" ");
        String[] strB = br.readLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(strA[i]);
            b[i] = Integer.parseInt(strB[i]);
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] * b[n - i - 1];
        }
        
        System.out.println(sum);
    }
}