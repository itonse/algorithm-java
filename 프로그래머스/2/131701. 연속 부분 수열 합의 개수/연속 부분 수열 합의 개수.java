import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        int arrLength = elements.length;
        int[] dp = new int[arrLength];
        
        for (int i = 0 ; i < arrLength; i++) {
            for (int j = 0; j < arrLength; j++) {
                dp[j] += elements[(j + i) % arrLength];
                set.add(dp[j]);
            }
        }

        return set.size();
    }
}