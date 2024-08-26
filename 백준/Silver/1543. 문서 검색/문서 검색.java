import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String word = br.readLine();
        int length = word.length();
        int answer = 0;

        StringBuilder sb = new StringBuilder();

        for (int idx = 0; idx < line.length(); idx++) {
            if (sb.length() == length) {
                sb.deleteCharAt(0);
            } 
            
            sb.append(line.charAt(idx));

            if (sb.toString().equals(word)) {
                answer++;
                sb = new StringBuilder();
            }
        }

        System.out.println(answer);
    }
}