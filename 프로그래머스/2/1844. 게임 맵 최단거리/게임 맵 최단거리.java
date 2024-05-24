import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        int h = maps.length;
        int w = maps[0].length;
        int[][] visited = new int[h][w];    // 각 위치의 방문여부와 최단 거리 저장

        bfs(maps, visited, h, w);

        int answer = visited[h-1][w-1];   
        return answer > 0 ? answer : -1;    
    }

    public void bfs(int[][] maps, int[][] visited, int h, int w) {
        int[][] d = {{1,0},{-1,0},{0,1},{0,-1}};   

        int x = 0;
        int y = 0;

        visited[y][x] = 1; 

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y,x});   

        while(!queue.isEmpty()) {    
            int[] now = queue.poll(); 
            int curR = now[0];  
            int curC = now[1];  

            for (int i = 0; i < 4; i++) {
                int nextR = curR + d[i][0];  
                int nextC = curC + d[i][1];   

                if (nextR >= 0 && nextR < h && nextC >= 0 && nextC < w
                        && visited[nextR][nextC] == 0 && maps[nextR][nextC] == 1) {
                    queue.add(new int[]{nextR, nextC});  
                    visited[nextR][nextC] = visited[curR][curC] + 1; 
                }
            }
        }
    }
}