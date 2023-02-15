class Solution {
    public StringBuilder solution(int age) {
        StringBuilder answer = new StringBuilder();
        char ch = 0;
        int num = 0;

        while(age != 0) {
            num = age % 10;
            ch = (char)('a' + num);
            answer.append(ch);
            age /= 10;
        }

        answer = answer.reverse();
        return answer;
    }
}