import java.util.ArrayList;

class Solution {
    public int[] solution(String[] strlist) {
        ArrayList list = new ArrayList<Integer>();
        int num = 0;

        for(int i = 0; i < strlist.length; i++) {
            num = strlist[i].length();
            list.add(num);
        }

        int[] answer = new int[list.size()];

        answer = list.stream().mapToInt(i -> (int) i).toArray();
        
        return answer;
    }
}