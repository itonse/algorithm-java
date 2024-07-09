import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        System.out.println(result(input));
    }

    private static int result(String input) {
        String[] minusParts = input.split("-");
        int result = sumOfPart(minusParts[0]);
        
        for (int i = 1; i < minusParts.length; i++) {
            result -= sumOfPart(minusParts[i]);
        }

        return result;
    }

    private static int sumOfPart(String part) {
        String[] addedParts = part.split("\\+");
        int sum = 0;
        
        for (String num : addedParts) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}