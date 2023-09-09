class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int len = number.length;

        for (int one = 0; one < len - 2; one++) {
            for (int two = one + 1; two < len - 1; two++) {
                for (int three = two + 1; three < len; three++) {
                    if (number[one] + number[two] + number[three] == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}