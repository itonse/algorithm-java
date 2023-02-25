class Solution {
    public int solution(int num, int k) {
        int idx = -1;

        String str = Integer.toString(num);

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) - '0' == k) {
                idx = i + 1;
                break;
            }
        }
        
        return idx;
    }
}