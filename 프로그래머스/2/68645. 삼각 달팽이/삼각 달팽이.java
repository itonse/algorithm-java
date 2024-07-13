class Solution {
    public int[] solution(int n) {
        int[] answer;
        int[][] arr = new int[n][];

        for (int i = 0; i < n; i++) {
            arr[i] = new int[i + 1];
        }

        int cnt = 1;
        int row = 0;
        int col = 0;
        int pathCnt = 0;

        while(true) {
            // DOWN
            while(row < n && arr[row][col] == 0) {
                arr[row++][col] = cnt++;
            }
            row--;
            col++;
            pathCnt++;
            
            if (pathCnt == n) {
                break;
            }
            // RIGHT
            while(col < n && arr[row][col] == 0) {
                arr[row][col++] = cnt++;
            }
            col -= 2;
            row--;
            pathCnt++;
            
            if (pathCnt == n) {
                break;
            }
            // UP
            while(arr[row][col] == 0) {
                arr[row--][col--] = cnt++;
            }
            row += 2;
            col++;
            pathCnt++;
            
            if (pathCnt == n) {
                break;
            }
        }

        answer = new int[cnt - 1];
        int cnt2 = 0;
        
        for (int[] tmp : arr) {
            for (int num : tmp) {
                answer[cnt2++] = num;
            }
        }

        return answer;
    }
}