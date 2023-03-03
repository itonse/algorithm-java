class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int tmp;
        int cnt = 0;

        if(num % 2 == 1) {
            tmp = total / num;  // 3
            for(int i = tmp - num / 2; i <= tmp + num / 2; i++) {
                answer[cnt++] = i;
            }
        } else {
            tmp = total / num;  // 3
            for(int j = tmp - num / 2 + 1; j <= tmp + num / 2; j++) {
                answer[cnt++] = j;
            }
        }
        
        return answer;
    }
}