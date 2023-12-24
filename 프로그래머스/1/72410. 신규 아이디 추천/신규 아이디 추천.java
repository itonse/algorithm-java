class Solution {
    public String solution(String new_id) {
        String answer = new_id
                .toLowerCase()    // 1단계
                .replaceAll("[^a-zA-Z0-9\\-_.]", "")    // 2단계
                .replaceAll("\\.+", ".")    // 3단계
                .replaceAll("^\\.|\\.$", "");    // 4단계

        if (answer.isBlank()) answer = "a";    // 5단계

        // 6단계
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("\\.$", "");
        }

        // 7단계
        if (answer.length() <= 2) {
            int length = answer.length();   
            char lastChar = answer.charAt(answer.length() - 1);

            for (int i = 0; i < 3 - length; i++) {
                answer += lastChar;
            }
        }

        return answer;
    }
}