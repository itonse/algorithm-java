class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        float incline1;
        float incline2;
        boolean flag = false;
        
        loop:
        for(int i = 0; i < dots.length - 1; i++) {
            for(int j = i + 1; j < dots.length; j++) {
                for(int k = 0; k < dots.length; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    for(int r = 0; r < dots.length; r++) {
                        if (r == i || r == j || r == k) {
                            continue;
                        }

                        incline1 = (float) (dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
                        incline2 = (float) (dots[k][1] - dots[r][1]) / (dots[k][0] - dots[r][0]);

                        if (incline1 == incline2) {
                            answer = 1;
                            flag = true;
                            break loop;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}