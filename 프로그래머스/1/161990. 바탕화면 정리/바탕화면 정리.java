class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        int left = Integer.MAX_VALUE;
        int top = Integer.MAX_VALUE;
        int right = 0;
        int down = 0;

        for (int row = 0; row < wallpaper.length; row++) {
            for (int col = 0; col < wallpaper[0].length(); col++) {
               if (wallpaper[row].charAt(col) == '#') {
                   left = Math.min(col, left);
                   right = Math.max(col, right);
                   top = Math.min(row, top);
                   down = Math.max(row, down);
               }
            }
        }

        answer[0] = top;
        answer[1] = left;
        answer[2] = down + 1;
        answer[3] = right + 1;

        return answer;
    }
}