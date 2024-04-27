class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int numLength = number.length();
        int remainingLength = numLength - k;
        int startIndex = 0;
        
        while (startIndex < numLength && answer.length() != remainingLength) {
            int endIndex = numLength - (remainingLength - answer.length()) + 1;
            
            int maxDigit = 0;
            int maxIndex = startIndex;
            
            for (int i = startIndex; i < endIndex; i++) {
                int digit = number.charAt(i) - '0';
                
                if (digit > maxDigit) {
                    maxDigit = digit;
                    maxIndex = i;
                }
            }
            
            answer.append(maxDigit);
            startIndex = maxIndex + 1;
        }
        
        return answer.toString();
    }
}