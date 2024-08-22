import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] argr) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int line = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < line; i++) {
            String input = br.readLine();
            String order = input.split(" ")[0];

            switch(order) {
                case "push":
                    stack.push(Integer.parseInt(input.split(" ")[1]));
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    int result = stack.isEmpty() ? 1 : 0;
                    System.out.println(result);
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;
                default:
            }
        }
    }
}