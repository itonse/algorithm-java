class Solution {
    private static String[] wallpaper;
    
    public int[] solution(String[] wallpaper) {
        Solution.wallpaper = wallpaper;
        int[] answer = new int[4];

        answer[0] = suchLuy();
        answer[1] = suchLux();
        answer[2] = suchRuy() + 1;
        answer[3] = suchRux() + 1;

        return answer;
    }

    private int suchLuy() {
        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                return i;
            }
        }
        return 0;
    }

    private int suchRuy() {
        for (int i = wallpaper.length - 1; i >= 0; i--) {
            if (wallpaper[i].contains("#")) {
                return i;
            }
        }
        return 0;
    }

    private int suchLux() {
        for (int i = 0; i < wallpaper[0].length(); i++) {
            for (int j = 0; j < wallpaper.length; j++) {
                if (wallpaper[j].charAt(i) == '#') {
                    return i;
                }
            }
        }
        return 0;
    }

    private int suchRux() {
        for (int i = wallpaper[0].length() - 1; i >= 0; i--) {
            for (int j = 0; j < wallpaper.length; j++) {
                if (wallpaper[j].charAt(i) == '#') {
                    return i;
                }
            }
        }
        return 0;
    }
}