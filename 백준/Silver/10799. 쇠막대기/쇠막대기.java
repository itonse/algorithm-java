import java.util.Stack;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();

        int layer = 0;
        int answer = 0;
        
        for (char ch : arr) {
            if (ch == '(') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    layer++;
                }
            }

            if (ch == ')') {
                if (stack.peek() == ')') {
                    layer--;
                    answer++;
                } else {
                    answer += layer;
                }
            }
            stack.push(ch);
        }
        
        System.out.println(answer);
    }
}