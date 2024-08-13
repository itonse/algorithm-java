import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        
        int[] boxes = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            boxes[i] = Integer.parseInt(str[i]);
        }

        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int idx = 0; idx < i; idx++) {
                if (boxes[idx] < boxes[i]) {
                    max = Math.max(max, dp[idx]);
                }
            }
            dp[i] = max + 1;
        }

        Arrays.sort(dp);
        System.out.println(dp[n - 1]);
    }
}