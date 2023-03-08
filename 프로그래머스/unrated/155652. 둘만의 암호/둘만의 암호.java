class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char ch;

        for(Character ch1: s.toCharArray()) {
            ch = ch1;
            
            int idx = 0;
            while(idx < index) {
                ch = ch == 'z' ? 'a' : (char) (ch + 1);
                if(!skip.contains(String.valueOf(ch))) {
                    idx++;
                }
            }
            answer += ch;
        }
        
        return answer;
    }
}