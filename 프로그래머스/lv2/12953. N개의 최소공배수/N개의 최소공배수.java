class Solution {
    public int solution(int[] arr) {
        int cnt = 0;
        int answer = 0;
        while (cnt != arr.length) {
            answer++;
            cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (answer % arr[i] == 0) {
                    cnt++;
                }
            }
        }
        
        return answer;
    }
}