import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int cntHigh = 0;
        int mode = 0;
        int[] cnt = new int[array.length];
        Arrays.fill(cnt, 0); 
        
        for (int i = 0; i < array.length; i++) {       // array의 각 원소의 빈도수 구하기
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]) {
                    cnt[i]++;
                }
            }
            if (cnt[i] > cntHigh) {      // 가장 높은 빈도수를 cntHigh에 저장
                    cntHigh = cnt[i];
                    mode = array[i];    // 가장 높은 빈도수의 원소값을 mode에 저장
                }
        }
        
        for (int k = 0; k < array.length; k++) {   // 최빈값이 여러개일 경우 찾기
            if (cnt[k] == cntHigh) {
                if (mode != array[k]) {     // 최빈값이 여러개이면 mode = -1 대입 후 종료
                    mode = -1;
                    break;
                }
            }
        }
        answer = mode;      // 최빈값(-1 포함)을 answer에 저장
        return answer;
    }
}