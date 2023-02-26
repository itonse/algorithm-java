class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int num = 0;

        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) - '0' <= 9) {
                num *= 10;
                num += my_string.charAt(i) - '0';
            } else {
                answer += num;
                num = 0;
            }
        }
        
        answer += num;
        return answer;
    }
}