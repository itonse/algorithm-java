import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int first = Integer.parseInt(str.split(" ")[0]);
        int second = Integer.parseInt(str.split(" ")[1]);
        
        Set<String> strSet = new HashSet<String>();
        int answer = 0;
        
        for (int idx = 0; idx < first; idx++) {
            strSet.add(br.readLine());
        }
        
        for (int idx = 0; idx < second; idx++) {
            String input = br.readLine();
            
            if (strSet.contains(input)) {
                answer++;
            }
        }
        
        br.close();
        System.out.println(answer);
    }
}