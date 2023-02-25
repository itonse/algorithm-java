class Solution {
    public int solution(int n) {
        int answer = 2;
        double db;
        db = Math.sqrt(n);

        if(db == (int) db) {
            answer = 1;
        }
        
        return answer;
    }
}