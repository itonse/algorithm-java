class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for (String str : babbling) {
            str = str.replace("aya", "1");
            str = str.replace("ye", "2");
            str = str.replace("ma", "3");
            str = str.replace("woo", "4");

            boolean isAnswer = true;
            for (int idx = 0; idx < str.length(); idx++) {
                if (Character.isLowerCase(str.charAt(idx))) {
                    isAnswer = false;
                    break;
                }
                if (idx < str.length() - 1 && str.charAt(idx) == str.charAt(idx + 1)) {
                    isAnswer = false;
                }
            }
            
            if (isAnswer) answer++;
        }

        return answer;
    }
}