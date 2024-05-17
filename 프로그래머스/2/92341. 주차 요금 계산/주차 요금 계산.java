import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.List;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        List<Integer> answer = new ArrayList<>();

        int defaultTime = fees[0];
        int baseRate = fees[1];
        int unitTime = fees[2];
        int unitRate = fees[3];

        TreeMap<String, List<Integer>> map = new TreeMap<>();

        for (String str : records) {
            String[] strArr = str.split(" ");

            int convertMinutes = convertTimeToMinutes(strArr[0]);
            int differenceInMinutes = 0;

            if (map.get(strArr[1]) == null) {
                List<Integer> list = new ArrayList<>();
                list.add(0);
                list.add(convertMinutes);
                list.add(1);

                map.put(strArr[1], list);
            } else {
                List<Integer> valueList = map.get(strArr[1]);
                if (valueList.get(2) == 1) {
                    differenceInMinutes = convertMinutes - valueList.get(1);
                    valueList.set(0, valueList.get(0) + differenceInMinutes);
                    valueList.set(1, 0);
                    valueList.set(2, 2);
                } else {
                    valueList.set(1, convertMinutes);
                    valueList.set(2, 1);
                }

                map.put(strArr[1], valueList);
            }
        }

        for (String key : map.keySet()) {
            int totalTime = 0;
            List<Integer> valueList = map.get(key);
            if (valueList.get(2) == 1) {
                totalTime = 24 * 60 - 1 - valueList.get(1) + valueList.get(0);
            } else {
                totalTime = valueList.get(0);
            }

            int totalRate = 0;

            if (totalTime - defaultTime <= 0) {
                totalRate = baseRate;
            } else {
                totalRate = (int) (baseRate + Math.ceil((double) (totalTime - defaultTime) / unitTime) * unitRate);
            }

            answer.add(totalRate);
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static int convertTimeToMinutes(String time) {
        String[] parts = time.split(":");

        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        return hours * 60 + minutes;
    }
}