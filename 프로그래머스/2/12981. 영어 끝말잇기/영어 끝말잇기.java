import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        HashSet<String> saidSet = new HashSet<>();
        int count = 0;
        char preTail = words[0].charAt(0);

        for (String str: words) {
            if (!saidSet.contains(str)) {
                if (str.charAt(0) == preTail) {
                    count++;
                    saidSet.add(str);
                } else {
                    break;
                }

                preTail = str.charAt(str.length() - 1);
            } else {
                break;
            }
        }

        if (words.length == saidSet.size()) {
            return new int[]{0, 0};
        } else {
            return new int[]{count % n + 1, count / n + 1};
        }
    }
}