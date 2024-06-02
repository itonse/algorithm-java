import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] result = new int[id_list.length];

        Map<String, HashSet<String>> reportedList = new HashMap<>();
        Map<String, Integer> reportedCnt = new HashMap<>();
        Map<String, Integer> idIdx = new HashMap<>();

        for (int idx = 0; idx < id_list.length; idx++) {
            reportedCnt.put(id_list[idx], 0);
            reportedList.put(id_list[idx], new HashSet<>());
            idIdx.put(id_list[idx], idx);
        }

        for (String str : report) {
            String reporter = str.split(" ")[0];
            String reportedPerson = str.split(" ")[1];

            if (!reportedList.get(reportedPerson).contains(reporter)) {
                reportedList.get(reportedPerson).add(reporter);
                reportedCnt.put(reportedPerson, reportedCnt.get(reportedPerson) + 1);
            }
        }

        for (String reportedPerson : reportedCnt.keySet()) {
            if (reportedCnt.get(reportedPerson) >= k) {
                for (String reporter : reportedList.get(reportedPerson)) {
                    result[idIdx.get(reporter)]++;
                }
            }
        }

        return result;
    }
}