import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answerList = new ArrayList<>();
        HashMap<Character, Integer> termsMap = new HashMap<Character, Integer>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate todayDate = LocalDate.parse(today, formatter);

        for (String str : terms) {
            String[] parts = str.split(" ");

            termsMap.put(parts[0].charAt(0), Integer.valueOf(parts[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            char alp = privacies[i].charAt(privacies[i].length() - 1);
            String dateString = privacies[i].substring(0, 10);

            LocalDate localDate = LocalDate.parse(dateString, formatter);

            if (localDate.plusMonths(termsMap.get(alp)).minusDays(1).isBefore(todayDate)) {
                answerList.add(i + 1);
            }
        }
        
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}