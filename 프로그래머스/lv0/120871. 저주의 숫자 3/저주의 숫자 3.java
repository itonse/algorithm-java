class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        int num;
        boolean flag;

        for(int i = 0; i < n; i++) {
            flag = true;
            cnt++;

            while(flag) {;
                flag = false;

                if (cnt % 3 == 0) {
                    cnt++;
                    flag = true;
                } else {
                    num = cnt;
                    while (num > 0) {
                        if (num % 10 == 3) {
                            cnt++;
                            flag = true;
                            break;
                        }
                        num /= 10;
                    }
                }
            }
        }
        
        answer = cnt;
        return answer;
    }
}