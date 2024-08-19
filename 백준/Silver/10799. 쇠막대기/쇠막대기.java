import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();

        int layer = 0;
        int answer = 0;
        char pre = ' ';

        for (char ch : arr) {
            if (ch == '(') {
                if (pre == '(') {
                    layer++;
                }
            }

            if (ch == ')') {
                if (pre == ')') {
                    layer--;
                    answer++;
                } else {
                    answer += layer;
                }
            }
            
            pre = ch;
        }

        System.out.println(answer);
    }
}