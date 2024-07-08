import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String strNum = br.readLine();
        String[] strNumArr = strNum.split(" ");
        int length = strNumArr.length;
        int[] intNumArr = new int[length];

        for (int i = 0; i < length; i++) {
            intNumArr[i] = Integer.parseInt(strNumArr[i]);
        }

        int[] copyArr = intNumArr.clone();
        Arrays.sort(copyArr);

        Map<Integer, Integer> map = new HashMap<>();
        int cnt = -1;

        for (int i = 0; i < length; i++) {
            if (map.get(copyArr[i]) == null) {
                map.put(copyArr[i], ++cnt);
            } else {
                map.put(copyArr[i], cnt);
            }
        }

        for (int i = 0; i < length; i++) {
            bw.write(map.get(intNumArr[i]) + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}