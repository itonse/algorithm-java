class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int hp = health;
        int curAttacksIdx = 0;
        int chainSuccess = 0;

        for (int time = 1; time <= attacks[attacks.length - 1][0]; time++) {
            if (time == attacks[curAttacksIdx][0]) {
                chainSuccess = 0;
                hp -= attacks[curAttacksIdx][1];

                if (hp <= 0) {
                    return -1;
                }

                curAttacksIdx++;
            } else if (chainSuccess + 1 == bandage[0]) {
                chainSuccess = 0;

                if (hp + bandage[2] > health) {
                    hp = health;
                } else {
                    hp += (bandage[1] + bandage[2]);
                }
            } else {
                chainSuccess++;

                if (hp + bandage[1] > health) {
                    hp = health;
                } else {
                    hp += bandage[1];
                }
            }
        }

        return hp;
    }
}