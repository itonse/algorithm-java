import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            
            for (int j = 0; j < n; j++) {
                String[] inputStr = br.readLine().split(" ");
                map.put(inputStr[1], map.getOrDefault(inputStr[1], 0) + 1);
            }
            
            if (map.size() == 1) {
                System.out.println(n);
            } else {
                int cal = 1;
                for (String key : map.keySet()) {
                    cal *= (map.get(key) + 1);
                }
                
                System.out.println(cal - 1);
            }
        }
    }
}