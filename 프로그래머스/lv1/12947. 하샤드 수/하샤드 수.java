class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int x_clone = x;
        int num = 0;
        
        while(x_clone > 0) {
            num += x_clone % 10;
            x_clone /= 10;
        }
        
        if (x % num != 0) {
            answer = false;
        }
        
        return answer;
    }
}