class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        
        do{
            answer++;
            num *= answer;
        }while(num <= n);
        
        return answer - 1;
    }
}