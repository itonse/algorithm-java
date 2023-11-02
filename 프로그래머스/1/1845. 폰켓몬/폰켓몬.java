import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        HashSet set = new HashSet();
        for (int i : nums) {
            set.add(i);
        }

        if (nums.length / 2 >= set.size()) {
            answer = set.size();
        } else {
            answer = nums.length / 2;
        }
        return answer;
    }
}