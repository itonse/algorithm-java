class Solution {
    public int solution(String[] spell, String[] dic) {
        int cnt = 0;
        int answer = 2;
        boolean flag = false;

        for(int i = 0; i < dic.length; i++) {
            for(int j = 0; j < spell.length; j++) {
                for(int k = 0; k < dic[i].length(); k++) {
                    if(spell[j].charAt(0) == dic[i].charAt(k)) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt == spell.length) {
                answer = 1;
                break;
            }

            cnt = 0;
        }
        
        return answer;
    }
}