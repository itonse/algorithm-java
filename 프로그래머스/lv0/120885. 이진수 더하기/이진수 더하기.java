class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int tmp = 0;

        tmp = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        answer = Integer.toBinaryString(tmp);
        
        return answer;
    }
}