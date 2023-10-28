class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String str1 = Integer.toBinaryString(arr1[i]);
            String str2 = Integer.toBinaryString(arr2[i]);

            str1 = checkLength(str1, n);
            str2 = checkLength(str2, n);

            String str = "";
            for (int j = 0; j < n; j++) {
                if (str1.charAt(j) == '1' || str2.charAt(j) == '1') {
                    str += '#';
                } else {
                    str += ' ';
                }
            }
            answer[i] = str;
        }
        return answer;
    }

    public String checkLength(String s, int n) {
        if (s.length() < n) {
            String zero = "";
            for (int i = 0; i < n - s.length(); i++) {
                zero += '0';
            }
            return zero + s;
        } else {
            return s;
        }
    }
}