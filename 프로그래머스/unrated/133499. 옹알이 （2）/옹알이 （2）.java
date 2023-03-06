class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        boolean dup = false;

        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("aya", "1");
            babbling[i] = babbling[i].replaceAll("ye", "2");
            babbling[i] = babbling[i].replaceAll("woo", "3");
            babbling[i] = babbling[i].replaceAll("ma", "4");
        }

        for (int i = 0; i < babbling.length; i++) {  // ayaye
            dup = false;

            for (int j = 0; j < babbling[i].length() - 1; j++) {   // 1 1
                if (babbling[i].charAt(j) == babbling[i].charAt(j + 1)) {
                    dup = true;
                }
            }

            babbling[i] = babbling[i].replaceAll("1|2|3|4", "");
            if(babbling[i].equals("") && dup == false) {
                answer++;
            }
        }
        
        return answer;
    }
}