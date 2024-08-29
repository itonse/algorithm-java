import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int N = Integer.parseInt(input.split(" ")[0]);
        int K = Integer.parseInt(input.split(" ")[1]);

        Deque<Integer> deq = new LinkedList<>();
        int[] answerArr = new int[N];

        for (int i = 1; i <= N; i++) {
            deq.add(i);
        }

        int cnt = 0;

        while (!deq.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                int tmp = deq.pollFirst();
                deq.addLast(tmp);
            }
            answerArr[cnt++] = deq.pollFirst();
        }

        System.out.print("<");
        for (int idx = 0; idx < N; idx++) {
            System.out.print(answerArr[idx]);
            if (idx < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}