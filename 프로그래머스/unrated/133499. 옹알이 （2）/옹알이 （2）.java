class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            String replaced = babbling[i]
                    .replaceAll("aya", "1")
                    .replaceAll("ye", "2")
                    .replaceAll("woo", "3")
                    .replaceAll("ma", "4");

            if (!replaced.matches(".*(.)\\1.*") && replaced.matches("[1-4]*")) {
                answer++;
            }
        }

        return answer;
    }
}