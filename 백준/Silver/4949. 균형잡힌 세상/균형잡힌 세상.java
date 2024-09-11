import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();

            if (".".equals(line)) {
                break;
            }

            Stack<Character> stack = new Stack<>();
            boolean isNo = false;

            for (int idx = 0; idx < line.length(); idx++) {
                char ch = line.charAt(idx);
                switch (ch) {
                    case '[':
                        stack.push('[');
                        break;
                    case ']':
                        if (stack.isEmpty()) {
                            System.out.println("no");
                            isNo = true;
                            break;
                        }
                        char popChar = stack.pop();
                        if (popChar != '[') {
                            System.out.println("no");
                            isNo = true;
                            break;
                    }
                        break;
                    case '(':
                        stack.push('(');
                        break;
                    case ')':
                        if (stack.isEmpty()) {
                            System.out.println("no");
                            isNo = true;
                            break;
                        }
                        char popChar2 = stack.pop();
                        if (popChar2 != '(') {
                            System.out.println("no");
                            isNo = true;
                            break;
                        }
                        break;
                    default:
                        break;
                }
                
                if (isNo) break;
            }

            if (stack.isEmpty() && !isNo) {
                System.out.println("yes");
            } else if (!isNo) {
                System.out.println("no");
            }
        }
    }
}