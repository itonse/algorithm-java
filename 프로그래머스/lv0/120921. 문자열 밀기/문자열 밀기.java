class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String concat = A.concat(A);
        int len = A.length();
        int cnt = 0;

        for(int i = B.length(); i >= 0; i--) {
            if(!concat.substring(i, i + len).equals(B)) {
                cnt++;
            } else {
                answer = cnt;
                break;
            }
        }
        
        return answer;
    }
}