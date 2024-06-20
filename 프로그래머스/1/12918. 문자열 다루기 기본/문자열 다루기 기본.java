class Solution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            for (char ch : s.toCharArray()) {
                System.out.println(ch - '0');
                if (!(0 <= ch - '0' && ch - '0' <= 9)) {
                    return false;
                }
            }
            
            return true;
        }
        
        return false;
    }
}