class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer;
        int str_idx = 0;
        int cnt = 0;
        int idx = 0;

        if(my_str.length() % n == 0) {
            str_idx = my_str.length() / n;
        } else {
            str_idx = my_str.length() / n + 1;
        }
        
        answer = new String[str_idx];

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
