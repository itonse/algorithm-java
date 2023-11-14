import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        int[] arr = Arrays.stream(s.split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();

        sb.append(Arrays.stream(arr).min().getAsInt());
        sb.append(' ');
        sb.append(Arrays.stream(arr).max().getAsInt());
    
        return sb.toString();
    }
}