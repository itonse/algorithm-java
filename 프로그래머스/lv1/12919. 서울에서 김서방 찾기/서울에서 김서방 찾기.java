class Solution {
    public String solution(String[] seoul) {
        String answer = "Kim";
		for (int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals(answer)) {
				answer = "김서방은 " + i + "에 있다";
                break;
			}
		}
      return answer;
    }
}