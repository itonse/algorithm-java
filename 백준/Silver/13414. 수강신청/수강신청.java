import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int K = Integer.parseInt(input.split(" ")[0]);
        int L = Integer.parseInt(input.split(" ")[1]);

        for (int i = 0; i < L; i++) {
            String stNumber = br.readLine();

            if (map.containsKey(stNumber)) {
                map.remove(stNumber);
            }
            map.put(stNumber, i);
        }

        int cnt = 0;
        for (String key : map.keySet()) {
            System.out.println(key);
            cnt++;
            if (cnt == K) break;
        }
    }
}