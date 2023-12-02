import java.util.HashMap;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int[][] xy = {
                {0, 0}, {0, 1}, {0, 2},
                {1, 0}, {1, 1}, {1, 2},
                {2, 0}, {2, 1}, {2, 2},
                {3, 0}, {3, 1}, {3, 2}
        };

        HashMap<Integer, int[]> map = new HashMap<>();

        for (int i = 1; i <= 12; i++) {
            map.put(i, xy[i - 1]);
        }
        map.put(0, xy[10]);

        int leftHand = 10;
        int rightHand = 12;
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                leftHand = num;
                sb.append("L");
            } else if (num == 3 || num == 6 || num == 9) {
                rightHand = num;
                sb.append("R");
            } else {
                int leftDistance = Math.abs(map.get(num)[0] - map.get(leftHand)[0]) + Math.abs(map.get(num)[1] - map.get(leftHand)[1]);
                int rightDistance = Math.abs(map.get(num)[0] - map.get(rightHand)[0]) + Math.abs(map.get(num)[1] - map.get(rightHand)[1]);

                if (leftDistance < rightDistance) {
                    leftHand = num;
                    sb.append("L");
                } else if (leftDistance > rightDistance) {
                    rightHand = num;
                    sb.append("R");
                } else {
                    if (hand.equals("left")) {
                        leftHand = num;
                        sb.append("L");
                    } else {
                        rightHand = num;
                        sb.append("R");
                    }
                }
            }
        }

        return sb.toString();
    }
}