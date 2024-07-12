import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> rpq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < repeat; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());  // 문서의 개수
            int m = Integer.parseInt(st.nextToken());  // 몇 번째로 출력되는지 궁금한 문서가 현재 큐에서 몇번째에 놓여있는지 (0번째 부터)
            int cnt = 1;
            int docs;

            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];

            for (int idx = 0; idx < n; idx++) {
                arr[idx] = Integer.parseInt(st.nextToken());
                rpq.add(arr[idx]);
                queue.add(arr[idx]);
            }

            while (!queue.isEmpty()) {
                docs = queue.poll();
                int peek = rpq.peek();

                if (m == 0) {
                    if (docs == peek) {
                        bw.write(String.valueOf(cnt));
                        bw.newLine();
                        break;
                    } else {
                        queue.add(docs);
                        m = queue.size() - 1;
                    }
                }
                else if (docs != peek) {
                    queue.add(docs);
                    m--;
                } else {
                    cnt++;
                    m--;
                    rpq.poll();
                }
            }

            queue.clear();
            rpq.clear();
        }
        bw.flush();
        bw.close();
    }
}