import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][3];

        String str = br.readLine();

        arr[0][0] = Integer.parseInt(str.split(" ")[0]);
        arr[0][1] = Integer.parseInt(str.split(" ")[1]);
        arr[0][2] = Integer.parseInt(str.split(" ")[2]);

        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int r = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[i][0] = r + Math.min(arr[i - 1][1], arr[i - 1][2]);
            arr[i][1] = g + Math.min(arr[i - 1][0], arr[i - 1][2]);
            arr[i][2] = b + Math.min(arr[i - 1][0], arr[i - 1][1]);
        }

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            answer = Math.min(answer, arr[n - 1][i]);
        }

        System.out.println(answer);
    }
}