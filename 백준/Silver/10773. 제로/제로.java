import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int num;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            num = Integer.parseInt(br.readLine());

            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        while (!stack.isEmpty())
            sum += stack.pop();

        System.out.println(sum);
    }
}