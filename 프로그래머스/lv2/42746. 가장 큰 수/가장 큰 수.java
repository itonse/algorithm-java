import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();

        List <String> numList = new ArrayList<>();

        for (int num: numbers) {
            numList.add(Integer.toString(num));
        }

        Collections.sort(numList, (o1, o2) -> Integer.parseInt(o2 + o1) - Integer.parseInt(o1 + o2));


        for (int i = 0; i < numList.size(); i++) {
            answer.append(numList.get(i));
        }

        String tmp = answer.toString();
        if (tmp.replaceAll("0", "").equals("")) {
            return "0";
        }

        return answer.toString();
    }
}