import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> ponketmon = new HashMap<Integer, Integer>();
        
		for (int i = 0; i < nums.length; i++) {
			if (ponketmon.containsKey(nums[i]))
				ponketmon.put(nums[i], ponketmon.get(nums[i]) + 1);
			else
				ponketmon.put(nums[i], 1);
		}
 
		return ponketmon.size() > nums.length / 2 ? nums.length / 2 : ponketmon.size();
    }
}