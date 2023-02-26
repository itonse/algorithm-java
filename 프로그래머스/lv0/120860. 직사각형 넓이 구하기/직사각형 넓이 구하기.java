class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int width = 0;
        int length = 0;

        for(int i = 1; i < 4; i++) {
            if(dots[0][0] != dots[i][0]) {
                width = Math.abs(dots[0][0] - dots[i][0]);
                break;
            }
        }
        
        for(int i = 1; i < 4; i++) {
            if(dots[0][1] != dots[i][1]) {
                length = Math.abs(dots[0][1] - dots[i][1]);
                break;
            }
        }
        
        answer = width * length;
        return answer;
    }
}