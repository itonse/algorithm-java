class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 6;
        
        while(i % n != 0) {
            i += 6;
        }
        answer = i/6;
        
        return answer;
    }
}