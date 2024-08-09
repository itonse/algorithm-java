import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int r = Integer.parseInt(input.split(" ")[0]);
        int c = Integer.parseInt(input.split(" ")[1]);

        char[][] map = new char[r + 2][c + 2];
        char[][] newMap = new char[r + 2][c + 2];

        for (int i = 1; i < r + 1; i++) {
            String line = br.readLine();
            for (int j = 1; j < c + 1; j++) {
                    char ch = line.charAt(j - 1);
                    map[i][j] = ch;
                    newMap[i][j] = ch;
            }
        }

        int minRow = r + 1;
        int maxRow = 0;
        int minCol = c + 1;
        int maxCol = 0;

        for (int i = 1; i < r + 1; i++) {
            for (int j = 1; j < c + 1; j++) {
                if (map[i][j] == 'X') {
                    int xCount = 0;

                    if (map[i - 1][j] == 'X') xCount++;
                    if (map[i + 1][j] == 'X') xCount++;
                    if (map[i][j - 1] == 'X') xCount++;
                    if (map[i][j + 1] == 'X') xCount++;

                    if (xCount < 2) {
                        newMap[i][j] = '.';
                    } else {
                        minRow = Math.min(minRow, i);
                        minCol = Math.min(minCol, j);
                        maxRow = Math.max(maxRow, i);
                        maxCol = Math.max(maxCol, j);
                    }
                }
            }
        }

        for (int i = minRow; i <= maxRow; i++) {
            for (int j = minCol; j <= maxCol; j++) {
                System.out.print(newMap[i][j]);
            }
            System.out.println();
        }
    }
}