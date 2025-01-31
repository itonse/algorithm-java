import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> word = new HashSet<String>();
        char[] s = br.readLine().toCharArray();
        
        for (int i = 0; i < s.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length; j++) {
                sb.append(s[j]);
                word.add(sb.toString());
            }
        }
        
        System.out.println(word.size());
    }
}