class Solution {
    public int[] solution(long n) {
        String s = Long.toString(n);
        
        int[] answer = new int[s.length()];
        int cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            answer[cnt++] = s.charAt(i) - '0';
        }
        
        return answer;
    }
}