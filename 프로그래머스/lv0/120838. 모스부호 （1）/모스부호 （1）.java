class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-",
                "-.--","--.."
        };

        String[] letter2 = letter.split(" ");

        for(String s: letter2) {
            for(int i = 0; i < morse.length; i++) {
                if(s.equals(morse[i])) {
                    answer += (char) (i + 'a');
                }
            }
        }
        
        return answer;
    }
}