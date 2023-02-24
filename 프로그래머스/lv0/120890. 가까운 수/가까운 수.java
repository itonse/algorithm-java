import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int left = 0;
        int right = 0;

        Arrays.sort(array);

        if(n <= array[0]) {
            answer = array[0];
        }else if(array[array.length - 1] <= n) {
            answer = array[array.length - 1];
        }else{
            for(int i = 1; i < array.length; i++) {
                if(array[i - 1] <= n && n <= array[i]) {
                    left = n - array[i - 1];
                    right = array[i] - n;

                    if(left == right) {
                        answer = array[i - 1];
                    } else {
                        answer = left < right ? array[i - 1] : array[i];
                    }
                }
            }
        }
        
        return answer;
    }
}