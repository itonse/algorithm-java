import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        LinkedList<String> cache = new LinkedList<>();

        for (String str : cities) {
            String rowString = str.toLowerCase();

            if (cache.contains(rowString)) {
                if (cache.size() == cacheSize) {
                    cache.remove(rowString);
                }

                answer += 1;
                cache.add(rowString);
            } else {
                if (cache.size() == cacheSize) {
                    cache.removeFirst();
                }

                answer += 5;
                cache.add(rowString);
            }
        }

        return answer;
    }
}