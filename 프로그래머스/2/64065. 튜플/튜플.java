import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        String[] strArr = s.split("},\\{");

        HashSet<String> set = new HashSet<>();

        Arrays.sort(strArr, Comparator.comparingInt(String::length));

        List<List<String>> lists = new ArrayList<>();

        for (String str : strArr) {
            lists.add(Arrays.stream(str.split(",")).collect(Collectors.toList()));
        }

        int[] answer = new int[lists.get(lists.size() - 1).size()];
        int answerIdx = 0;

        for (List<String> list : lists) {
            for (String str : list) {
                if (!set.contains(str)) {
                    answer[answerIdx++] = Integer.parseInt(str);
                    set.add(str);
                }
            }
        }

        return answer;
    }
}