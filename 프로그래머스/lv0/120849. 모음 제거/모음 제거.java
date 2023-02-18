class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charArr = my_string.toCharArray();

        for(int i = 0; i < charArr.length; i++) {
            if(!(charArr[i] == 'a' || charArr[i] == 'e' || charArr[i] == 'i' || charArr[i] == 'o' || charArr[i] == 'u')) {
                answer += charArr[i];
            }
        }
        
        return answer;
    }
}