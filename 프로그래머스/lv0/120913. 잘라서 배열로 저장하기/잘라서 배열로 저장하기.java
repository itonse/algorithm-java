class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int) Math.round(my_str.length() / (float) n + 0.4999)];
        int cnt = 0;
        int idx = 0;
        
        while(cnt < my_str.length()) {
            if (cnt + n < my_str.length()) {
                answer[idx] = my_str.substring(cnt, cnt + n);
                cnt += n;
                idx++;    
            } else {
                answer[idx] = my_str.substring(cnt, my_str.length());
                break;
            }
        }
        
        return answer;
    }
    
    
}