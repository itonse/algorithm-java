class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = "";

        str = my_string.replaceAll("[a-z|A-Z]", "");

        for(int j = 0; j < str.length(); j++) {
            answer += str.charAt(j) - '0';
        }
        
        return answer;
    }
}