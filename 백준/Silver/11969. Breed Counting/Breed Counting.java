import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        
        int[][] prefixSum = new int[N + 1][4];
        
        for (int i = 1; i <= N; i++) {
            int breed = Integer.parseInt(br.readLine());
            
            for (int j = 1; j <= 3; j++) {
                prefixSum[i][j] = prefixSum[i - 1][j];
            }
            prefixSum[i][breed]++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            int holsteins = prefixSum[b][1] - prefixSum[a - 1][1];
            int guernseys = prefixSum[b][2] - prefixSum[a - 1][2];
            int jerseys = prefixSum[b][3] - prefixSum[a - 1][3];
            
            sb.append(holsteins).append(" ").append(guernseys).append(" ").append(jerseys).append("\n");
        }
        
        System.out.print(sb.toString());
    }
}