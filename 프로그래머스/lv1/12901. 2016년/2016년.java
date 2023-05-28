import java.time.DayOfWeek;
import java.time.LocalDateTime;

class Solution {
    public String solution(int a, int b) {
        return LocalDateTime.of(2016, a, b, 0, 0).getDayOfWeek().toString().substring(0, 3);
    }
}