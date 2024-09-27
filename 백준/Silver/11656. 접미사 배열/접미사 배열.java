import java.util.Arrays;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] suffixes = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            suffixes[i] = s.substring(i);
        }

        Arrays.sort(suffixes);

        for (String suffix : suffixes) {
            System.out.println(suffix);
        }
    }
}