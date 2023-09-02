class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cnt1 = 0, cnt2 = 0;

        for (String word : goal) {
            if (cnt1 < cards1.length && cards1[cnt1].equals(word)) {
                cnt1++;
            } else if (cnt2 < cards2.length && cards2[cnt2].equals(word)) {
                cnt2++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}