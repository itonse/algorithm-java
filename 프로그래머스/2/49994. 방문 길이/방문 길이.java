import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        Set<String> set = new HashSet<>();

        int preX = 0;
        int preY = 0;
        int newX = 0;
        int newY = 0;

        String key = "";
        String reversKey = "";

        for (char dir : dirs.toCharArray()) {
            if (dir == 'L') {
                if (newX == -5) continue;
                newX--;
            } else if (dir == 'R') {
                if (newX == 5) continue;
                newX++;
            } else if (dir == 'U') {
                if (newY == 5) continue;
                newY++;
            } else {
                if (newY == -5) continue;
                newY--;
            }

            key = toKey(preX, preY, newX, newY);
            reversKey = toKey(newX, newY, preX, preY);
            if (!set.contains(key) && !set.contains(reversKey)) {
                answer++;
                set.add(key);
                set.add(reversKey);
            }

            preX = newX;
            preY = newY;
        }

        return answer;
    }

    public static String toKey(int preX, int preY, int newX, int newY) {
        return String.valueOf(preX) + String.valueOf(preY)
                + String.valueOf(newX) + String.valueOf(newY);
    }
}