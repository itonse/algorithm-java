import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // HEAD, NUMBER, TAIL 을 분리해서 String 배열에 저장
                String[] strArr1 = divide(s1);
                String[] strArr2 = divide(s2);

                // HEAD 비교 (대소문자 구분X)
                int headCompare = strArr1[0].compareToIgnoreCase(strArr2[0]);
                if (headCompare != 0) {
                    return headCompare;
                }

                // HEAD 가 같을 경우, NUMBER 비교
                int number1 = Integer.parseInt(strArr1[1]);
                int number2 = Integer.parseInt(strArr2[1]);
                return Integer.compare(number1, number2);
            }
        });

        return files;
    }

    private String[] divide(String file) {
        String head = "";
        String number = "";
        String tail = "";

        int i = 0;
        // HEAD 추출
        while (i < file.length() && !Character.isDigit(file.charAt(i))) {
            head += file.charAt(i);
            i++;
        }

        // NUMBER 추출
        while (i < file.length() && Character.isDigit(file.charAt(i))) {
            number += file.charAt(i);
            i++;
        }

        // TAIL 추출
        if (i < file.length()) {
            tail = file.substring(i);
        }

        return new String[]{head, number, tail};
    }
}