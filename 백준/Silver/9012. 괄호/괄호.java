import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            Stack stack = new Stack<>();
            boolean isTrue = true;

            String[] str = br.readLine().split("");

            for (int j = 0; j < str.length; j++) {
                if (str[j].equals("(")) {
                    stack.push(str[j]);
                } else {
                    if (stack.isEmpty()) {
                        isTrue = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (isTrue && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
