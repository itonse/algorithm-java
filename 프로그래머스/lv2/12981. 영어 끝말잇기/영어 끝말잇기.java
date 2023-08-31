import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        HashSet<String> set = new HashSet<>();
        
        set.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1) 
                || set.contains(words[i])) {
                
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }
            set.add(words[i]);
        }
        
        return answer; 
    }
}