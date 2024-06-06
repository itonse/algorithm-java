import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];   // 실패율이 높은 스테이지부터 내림차순 정렬, 같은경우 하위 스테이지 먼저
        Map<Integer, Double> map = new HashMap<>();
        int stagesLen = stages.length;

        Arrays.sort(stages);

        for (int i = 1; i <= N; i++) {
            map.put(i, 0.0);
        }

        for (int i: stages) {
            for (int j = 1; j < i; j++) {
                map.replace(j, (map.get(j) + 1));
            }

        }

        int tmp = stagesLen;

        int numerator = stagesLen - map.get(1).intValue();
        tmp -= numerator;
        map.replace(1, (double) numerator / stagesLen);
        stagesLen = tmp;

        for (int i = 2; i <= N; i++) {
            numerator = stagesLen - map.get(i).intValue();
            tmp -= numerator;
            
            if (stagesLen > 0) {
                map.replace(i, (double) numerator / stagesLen);
            } else {
                map.replace(i, 0.0);
            }
            stagesLen = tmp;
        }

        List<Map.Entry<Integer, Double>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort((o1, o2) -> {
            double result = o2.getValue().compareTo(o1.getValue());   // Double 값 비교를 위해 '-' 연산자 대신 .compareTo() 이용
            if (result == 0) {
                return o1.getKey().compareTo(o2.getKey());
            }
            return (int) result;
        });

        int idx = 0;
        for (Map.Entry<Integer, Double> entry : entryList) {
            answer[idx++] = entry.getKey();
        }

        return answer;
    }
}