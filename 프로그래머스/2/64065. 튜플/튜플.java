import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        String[] strArr = s.split("},\\{");

        HashSet<String> set = new HashSet<>();

        Arrays.sort(strArr, Comparator.comparingInt(String::length));

        List<String> list = new ArrayList<>();

        for (String str : strArr) {
            list.add(str);
        }

        int[] answer = new int[list.get(list.size() - 1).split(",").length];
        int answerIdx = 0;

        for (String str : list) {
            for (String element : str.split(",")) {
                if (set.add(element)) {
                    answer[answerIdx++] = Integer.parseInt(element);
                }
            }
        }

        return answer;
    }
}