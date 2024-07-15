import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int answer = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int start = 0;
        int end = 0;
        int sum = 0;

        while (true) {
            if (sum >= M) {
                sum -= A[start++];
            } else if (end >= A.length) {
                break;
            } else {
                sum += A[end++];
            }

            if (sum == M) {
                answer++;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}