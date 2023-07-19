import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        HashSet hashSet = new HashSet();

        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            for (int j = 0; j < elements.length - 1; j++) {
                sum += elements[(i + j) % elements.length];
                hashSet.add(sum);
            }
        }


        return hashSet.size() + 1;
    }
}