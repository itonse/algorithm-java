import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        int[] arr = new int[my_string.length()];

        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) <= 'Z') {
                arr[i] = my_string.charAt(i) - 'A' + 'a';
            } else {
                arr[i] = (int) my_string.charAt(i);
            }
        }

        Arrays.sort(arr);

        for(int j = 0; j < arr.length; j++) {
            answer += (char) arr[j];
        }
        
        return answer;
    }
}