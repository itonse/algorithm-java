import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int kim = Integer.valueOf(st.nextToken());
        int im = Integer.valueOf(st.nextToken());

        Queue<Character> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            if (i == kim || i == im) {
                queue.offer('X');
            } else {
                queue.offer('1');
            }
        }

        int answer = -1;
        int round = 0;
        
        while (answer != round) {
            round++;

            int many = queue.size();
            for (int i = 1; i <= many / 2; i++) {
                char tmp1 = queue.poll();
                char tmp2 = queue.poll();

                if (tmp1 == tmp2 && tmp2 == 'X') {
                    answer = round;
                    break;
                } else if (tmp1 == 'X') {
                    queue.offer('X');
                } else if (tmp2 == 'X') {
                    queue.offer('X');
                } else {
                    queue.offer('1');
                }
            }

            if (many % 2 == 1) {
                queue.offer(queue.poll());
            }
        }

        System.out.println(answer);
    }
}