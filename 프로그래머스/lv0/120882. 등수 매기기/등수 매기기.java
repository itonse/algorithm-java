class Solution {
    public int[] solution(int[][] score) {
        double[] avr = new double[score.length];
        int[] answer = new int[score.length];
        int cnt = 0;

        for(int i = 0; i < score.length; i++) {
            avr[i] = (double) (score[i][0] + score[i][1]) / 2;
        }
        
        for(int i = 0; i < avr.length; i++) {
            cnt = 1;
            
            for(int j = 0; j < avr.length; j++) {
                if(avr[i] < avr[j]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        
        return answer;
    }
}