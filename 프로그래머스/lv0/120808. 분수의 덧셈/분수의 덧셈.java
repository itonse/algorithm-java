class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int numer3, denom3, small;
        
        denom3 = denom1 * denom2;
        numer3 = numer1 * denom2 + denom1 * numer2;
        
        small = denom3 < numer3 ? denom3 : numer3;
        
        for (int i = small; i >= 2; i--) {
            if (denom3 % i == 0 && numer3 % i == 0) {
                denom3 /= i;
                numer3 /= i;
                
                break;
            }
        }
        
        int[] answer = {numer3, denom3};
        return answer;
    }
}