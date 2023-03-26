class Solution {
    public int solution(int num) {
        int answer = 0;

        if (num == 1) {
            return 0;
        }

        int cnt = 0;
        long tmp = num;
        while (tmp != 1) {
            if (tmp % 2 == 0) {
                tmp /= 2;
            } else {
                tmp = tmp * 3 + 1;
            }
            cnt++;

            if (cnt == 500) {
                if (tmp != 1) {
                    cnt = -1;
                    break;
                } else {
                    break;
                }
            }
        }

        answer = cnt;
        return answer;
    }
}