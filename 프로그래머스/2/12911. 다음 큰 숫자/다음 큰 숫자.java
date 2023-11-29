class Solution {
    public int solution(int n) {
        int answer = 0;
        String binary = Integer.toString(n, 2); 
        int oneCount = 0;
        
        for (char ch : binary.toCharArray()) {
            if (ch == '1') {
                oneCount++;
            }
        }
        
        while (n < 1000000) {
            n++;
            if (oneCount(n) == oneCount) {
                answer = n;
                break;
            }
        }

        return answer;
    }

    private int oneCount (int n) {
        String binary = Integer.toString(n, 2);
        int binarySize = binary.length();
        int oneCount = 0;
        
        for (char ch : binary.toCharArray()) {
            if (ch == '1') {
                oneCount++;
            }
        }
        
        return oneCount;
    }
}