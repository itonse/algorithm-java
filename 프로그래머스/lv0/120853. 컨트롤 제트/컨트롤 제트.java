class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split("\\s");
        int sum = 0;

        for(int i = 0; i < str.length; i++) {
            if(str[i].equals("Z")) {
                sum -= Integer.parseInt(str[i - 1]);
            } else{
                sum += Integer.parseInt(str[i]);
            }
        }
        
        answer = sum;
        return answer;
    }
}