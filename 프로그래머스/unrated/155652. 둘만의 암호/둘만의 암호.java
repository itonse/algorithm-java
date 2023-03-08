class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char ch;
        boolean isSkip = true;

        for(Character ch1: s.toCharArray()) {
            ch = ch1;
            for(int i = 0; i < index; i++) {
                ch++;
                if(ch == 'z' + 1) {
                    ch = 'a';
                }

                isSkip = true;
                while(isSkip) {
                    isSkip = false;
                    
                    for (Character ch2 : skip.toCharArray()) {
                        if (ch2.equals(ch)) {
                            isSkip = true;
                            ch++;
                        }
                        
                        if(ch == 'z' + 1) {
                            ch = 'a';
                        }
                    }
                }
            }

            answer += ch;
        }
        
        return answer;
    }
}