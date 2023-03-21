class Solution {
    public int solution(int n) {
        String s = Integer.toBinaryString(n);  // "1001110"

        int cnt1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt1++;
            }
        }
        
        int cnt2 = -1;
        while (cnt2 != cnt1) {
            cnt2 = 0;
            n++;
            
            String s2 = Integer.toBinaryString(n);
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) == '1') {
                    cnt2++;
                }
            }
        }
        
        int answer = n;
        return answer;
    }
}