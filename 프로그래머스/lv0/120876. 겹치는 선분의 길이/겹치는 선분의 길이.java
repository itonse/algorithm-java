class Solution {
    public int solution(int[][] lines) {
        int[] cnt = new int[200];
        int start;
        int end;
        int answer = 0;

        for(int i = 0; i < lines.length; i++) {
            start = lines[i][0];
            end = lines[i][1];

            for(int j = start; j < end; j++) {
                cnt[j + 100]++;
            }
        }

        for(int k = 0; k < cnt.length; k++) {
            if(cnt[k] > 1) {
                answer++;
            }
        }
        
        return answer;
    }
}