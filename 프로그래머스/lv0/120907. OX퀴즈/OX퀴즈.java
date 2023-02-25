class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] tmp = new String[5];

        for(int i = 0; i < quiz.length; i++) {
            tmp = quiz[i].split(" ");

            if (tmp[1].equals("+")) {
                if ((Integer.valueOf(tmp[0]) + Integer.valueOf(tmp[2])) == Integer.valueOf(tmp[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (tmp[1].equals("-")) {
                if ((Integer.valueOf(tmp[0]) - Integer.valueOf(tmp[2])) == Integer.valueOf(tmp[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}