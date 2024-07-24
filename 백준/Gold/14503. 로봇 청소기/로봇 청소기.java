import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nm = br.readLine();
        int n = Integer.parseInt(nm.split(" ")[0]);
        int m = Integer.parseInt(nm.split(" ")[1]);


        String rcd = br.readLine();
        int r = Integer.parseInt(rcd.split(" ")[0]);
        int c = Integer.parseInt(rcd.split(" ")[1]);
        int d = Integer.parseInt(rcd.split(" ")[2]);

        int[][] map = new int[n][m];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while (true) {
            if (map[r][c] == 0) {  // 현재 칸이 아직 청소되지 않은 경우
                map[r][c] = 2;  // 청소 완료
                answer++;
            }

            boolean flag = false;

            for (int i = 0; i < 4; i++) {
                d = (d + 3) % 4; // 반시계 방향으로 90도 회전

                int r2 = r, c2 = c;

                if (d == 0) r2--;
                else if (d == 1) c2++;
                else if (d == 2) r2++;
                else if (d == 3) c2--; 

                if (r2 >= 0 && r2 < n && c2 >= 0 && c2 < m && map[r2][c2] == 0) {
                    r = r2;
                    c = c2;
                    flag = true;
                    break;
                }
            }

            if (flag == false) {  // 주변 4칸 중 청소되지 않은 빈 칸이 없는 경우
                int r2 = r, c2 = c;

                if (d == 0) r2++;
                else if (d == 1) c2--;
                else if (d == 2) r2--;
                else if (d == 3) c2++;

                if ((c2 < 0 || c2 >= m) || (r2 < 0 && r2 >= n) || map[r2][c2] == 1) {
                    System.out.println(answer);
                    return;  // 작동 멈추기 (while문 종료)
                } else {  // 한 칸 후진
                    r = r2;
                    c = c2;
                }
            }
        }
    }
}