class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int tmp = 0;
        boolean is_change = true;
        int min = a < b ? a : b;
        
        for(int i = min; i >= 2; i--) {
            if(a % i == 0 && b % i == 0) {
                a = a / i;
                b = b / i;
                break;
            }
        }

        while (is_change) {
            is_change = false;
            tmp = b;
            
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0) {
                b /= 5;
            }
            
            if(tmp != b) {
                is_change = true;
            }
        }

        if (b == 1) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}