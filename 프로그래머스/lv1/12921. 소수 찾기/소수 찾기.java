class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean check = false;

        if (n < 5) {
            for (int i = 2; i <= n; i++) {
                check = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }

                if (check) {
                    answer++;
                }
            }
        } else {
            answer = 2;

            for (int i = 5; i <= n; i += 6) {
                check = true;
                for (int j = 2; j < Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }

                if (check) {
                    answer++;
                }

                if (i + 2 <= n) {
                    check = true;
                    for (int j = 2; j < Math.sqrt(i) + 2; j++) {
                        if ((i + 2) % j == 0) {
                            check = false;
                            break;
                        }
                    }

                    if (check) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}