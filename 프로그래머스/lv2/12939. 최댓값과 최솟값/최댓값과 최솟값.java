import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        Integer[] arr2 = Arrays.stream(arr).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        StringBuffer sb = new StringBuffer();

        Arrays.sort(arr2);

        sb.append(arr2[0]);
        sb.append(" ");
        sb.append(arr2[arr2.length - 1]);

        String answer = sb.toString();
        
        return answer;
    }
}