class Solution {
    public int solution(int[] arr) {
   
        java.util.Arrays.sort(arr);
        
        int answer = arr[arr.length - 1];

        while (true) {
            boolean isLCM = true;

            for (int num : arr) {
                if (answer % num != 0) {
                    isLCM = false;
                    break;
                }
            }

            if (isLCM) {
                return answer;
            }

            answer++;
        }
    }
}