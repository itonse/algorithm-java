import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] arr1 = new char[before.length()];
        char[] arr2 = new char[after.length()];
        int cnt = 0;
        
        for(int i = 0; i < before.length(); i++) {
            arr1[i] = before.charAt(i);
            arr2[i] = after.charAt(i);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] == arr2[i]) {
                cnt++;
            }
        }
        
        if(cnt == arr1.length) {
            answer = 1;
        }
        
        return answer;
    }
}