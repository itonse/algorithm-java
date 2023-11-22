import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        int idx = 0;
        while (idx < A.length) {
            answer += A[idx] * B[A.length - idx - 1];
            idx++;
        }

        return answer;
    }
}