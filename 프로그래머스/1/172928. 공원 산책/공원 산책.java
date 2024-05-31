class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] current = {0, 0};   // row, col
        int[][] states = new int[park.length][park[0].length()];
        boolean startPointFound = false;

        for (int row = 0; row < park.length; row++) {
            for (int col = 0; col < park[0].length(); col++) {
                if (!startPointFound && park[row].charAt(col) == 'S') {
                    startPointFound = true;
                    current[0] = row;
                    current[1] = col;
                    states[row][col] = 1;
                } else if (park[row].charAt(col) == 'O') {
                    states[row][col] = 1;
                } else {
                    states[row][col] = 0;
                }
            }
        }

        for (String route : routes) {
            String[] split = route.split(" ");
            String direction = split[0];
            int space = Integer.parseInt(split[1]);
            boolean isBlock = false;

            if (direction.startsWith("N")) {
                if (current[0] - space >= 0 && states[current[0] - space][current[1]] == 1) {
                    for (int i = current[0]; i > current[0] - space; i--) {
                        if (states[i][current[1]] == 0) {
                            isBlock = true;
                            break;
                        }
                    }
                    if (!isBlock) {
                        current[0] -= space;
                    }
                    continue;
                }
            }
            if (direction.startsWith("S")) {
                if (current[0] + space < park.length && states[current[0] + space][current[1]] == 1) {
                    for (int i = current[0]; i < current[0] + space; i++){
                        if (states[i][current[1]] == 0) {
                            isBlock = true;
                            break;
                        }
                    }
                    if (!isBlock) {
                        current[0] += space;
                    }
                    continue;
                }
            }
            if (direction.startsWith("W")) {
                if (current[1] - space >= 0 && states[current[0]][current[1] - space] == 1) {
                    for (int i = current[1]; i > current[1] - space; i--) {
                        if (states[current[0]][i] == 0) {
                            isBlock = true;
                            break;
                        }
                    }
                    if (!isBlock) {
                        current[1] -= space;
                    }
                    continue;
                }
            }
            if (direction.startsWith("E")) {
                if (current[1] + space < park[0].length() && states[current[0]][current[1] + space] == 1) {
                    for (int i = current[1]; i < current[1] + space; i++) {
                        if (states[current[0]][i] == 0) {
                            isBlock = true;
                            break;
                        }
                    }
                    if (!isBlock) {
                        current[1] += space;
                    }
                    continue;
                }
            }
        }

        return current;
    }
}