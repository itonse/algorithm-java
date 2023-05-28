import java.time.DayOfWeek;
import java.time.LocalDateTime;

class Solution {
    public String solution(int a, int b) {
        DayOfWeek dayOfWeek = LocalDateTime.of(2016, a, b, 0, 0).getDayOfWeek();
        String dow = dayOfWeek.name();
        return dow.substring(0, 3);
    }
}