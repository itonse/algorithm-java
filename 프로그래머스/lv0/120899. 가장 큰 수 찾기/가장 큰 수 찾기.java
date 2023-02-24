class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max_i = -1;
        int max = -1;

        for(int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max_i = i;
                max = array[i];
            }
        }

        answer[0] = array[max_i];
        answer[1] = max_i;
        
        return answer;
    }
}