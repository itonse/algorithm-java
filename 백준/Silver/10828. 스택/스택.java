import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] argr) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int line = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < line; i++) {
            String input = br.readLine();

            if (input.startsWith("push")) {
                int value = Integer.parseInt(input.substring(5));
                stack.push(value);
            } else if (input.equals("top")) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.peek() + "\n");
                }
            } else if (input.equals("size")) {
                bw.write(stack.size() + "\n");
            } else if (input.equals("empty")) {
                bw.write((stack.isEmpty() ? 1 : 0) + "\n");
            } else if (input.equals("pop")) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.pop() + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }
}