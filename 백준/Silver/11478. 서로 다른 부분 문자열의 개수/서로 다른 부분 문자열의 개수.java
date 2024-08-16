import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
        int arrLength = arr.length;

        HashSet<String> set = new HashSet<>();

        for (int start = 0; start < arrLength; start++) {
            StringBuilder sb = new StringBuilder();
            for (int j = start; j < arrLength; j++) {
                sb.append(arr[j]);
                set.add(sb.toString());
            }
        }

        System.out.println(set.size());
    }
}