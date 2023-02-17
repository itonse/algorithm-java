class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int temp = 0;

        if(direction.equals("right")) {
            temp = numbers[numbers.length - 1];

            for(int i = numbers.length - 2; i >= 0; i--) {
                answer[i + 1] = numbers[i];
            }
            answer[0] = temp;
        } else{
            temp = numbers[0];

            for(int j = numbers.length - 1; j >= 1; j--) {
                answer[j - 1] = numbers[j];
            }
            answer[numbers.length - 1] = temp;
        }
        
        return answer;
    }
}