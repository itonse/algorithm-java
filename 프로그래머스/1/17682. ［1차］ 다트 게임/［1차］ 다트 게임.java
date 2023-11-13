class Solution {
    public int solution(String dartResult) {
        int totalScore = 0;
        int preScore = 0;

        int point = 0;
        while(point < dartResult.length()) {
            int score = 0;
            
            if ('1' <= dartResult.charAt(point) && dartResult.charAt(point) <= '9') {
                if (dartResult.charAt(point + 1) == '0') {
                    point++;
                    score = 10;
                } else {
                    score = dartResult.charAt(point) - '0';
                }
            }

            switch (dartResult.charAt(++point)) {
                case 'D':
                    score = (int) Math.pow(score, 2);
                    break;
                case  'T':
                    score = (int) Math.pow(score, 3);
                    break;
            }

            point++;
            if (point < dartResult.length() && dartResult.charAt(point) == '*') {
                totalScore += preScore;
                score *= 2;
                point++;
            }
            if (point < dartResult.length() && dartResult.charAt(point) == '#') {
                score *= -1;
                point++;
            }

            totalScore += score;
            preScore = score;
        }

        return totalScore;
    }
}