import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {2, 6, 8, 14};
        System.out.println(solution.solution(arr));
    }
}

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}