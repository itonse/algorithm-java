import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int roof = Integer.parseInt(br.readLine());

        for (int i = 0; i < roof; i++) {
            stack.clear();
            String input = br.readLine();
            boolean complete = true;

            for (int index = 0; index < input.length(); index++) {
                if (input.charAt(index) == '(') {
                    stack.push('(');
                } else {
                    if (stack.isEmpty()) {
                        complete = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (!stack.isEmpty() || !complete) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}