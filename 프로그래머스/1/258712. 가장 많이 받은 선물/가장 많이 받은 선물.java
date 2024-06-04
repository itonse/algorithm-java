import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> personalCnt = new HashMap<>();
        Map<String, HashMap<String, Integer>> personalMap = new HashMap<>();
        Map<String, Integer> expectCnt = new HashMap<>();

        for (String s1 : friends) {
            personalCnt.put(s1, 0);
            expectCnt.put(s1, 0);
            HashMap<String, Integer> value = new HashMap<>();
            personalMap.put(s1, value);
            
            for (String s2 : friends) {
                if (!s1.equals(s2)) {
                    value.put(s2, 0);
                    personalMap.put(s1, value);
                }
            }
        }

        for (String str : gifts) {
            String giver = str.split(" ")[0];
            String taker = str.split(" ")[1];

            personalCnt.replace(giver, personalCnt.get(giver) + 1);
            personalCnt.replace(taker, personalCnt.get(taker) - 1);

            HashMap<String, Integer> value = personalMap.get(giver);
            value.replace(taker, value.get(taker) + 1);
            personalMap.replace(giver, value);
        }

        for (String a : friends) {
            for (String b : friends) {
                if (a.equals(b)) {
                    continue;
                } else {
                    if (personalMap.get(a).get(b) > personalMap.get(b).get(a)) {
                        expectCnt.replace(a, expectCnt.get(a) + 1);
                    }
                    if (personalMap.get(a).get(b).equals(personalMap.get(b).get(a))) {
                        if (personalCnt.get(a) > personalCnt.get(b)) {
                            expectCnt.replace(a, expectCnt.get(a) + 1);
                        }
                    }
                }
            }
        }

        int max = 0;
        for (String name : friends) {
            max = Math.max(max, expectCnt.get(name));
        }

        return max;
    }
}