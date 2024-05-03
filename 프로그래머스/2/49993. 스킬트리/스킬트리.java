import java.util.HashMap;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int idx = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : skill.toCharArray()) {
            map.put(ch, idx++);
        }

        for (String str : skill_trees) {
            int curIdx = 0;
            boolean flag = true;

            for (char point : str.toCharArray()) {
                if (map.get(point) != null) {
                    if (map.get(point) > curIdx) {  
                        flag = false;
                        break;
                    } else {
                        curIdx++;
                    }
                }
            }
            if (flag) {
                answer++;
            }
        }

        return answer;
    }
}