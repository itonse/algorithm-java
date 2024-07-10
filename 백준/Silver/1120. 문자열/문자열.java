import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String word1 = st.nextToken();
        String word2 = st.nextToken();

        if (word1.length() < word2.length()) {
            String temp = word1;
            word1 = word2;
            word2 = temp;
        }

        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i <= word1.length() - word2.length(); i++) {
            int currentDifference = 0;
            for (int j = 0; j < word2.length(); j++) {
                if (word1.charAt(i + j) != word2.charAt(j)) {
                    currentDifference++;
                }
            }
            minDifference = Math.min(minDifference, currentDifference);
        }

        System.out.println(minDifference);
    }
}