import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int num;
        while (queue.size() >= 2) {
            queue.remove();
            num = queue.poll();
            queue.add(num);
        }

        System.out.println(queue.peek());
    }
}