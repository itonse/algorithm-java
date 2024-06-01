import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<Integer, String> orderAndName = new HashMap<>();
        HashMap<String, Integer> nameAndOrder = new HashMap<>();

        int cnt = 1;
        for (String str : players) {
            orderAndName.put(cnt, str);
            nameAndOrder.put(str, cnt);
            cnt++;
        }

        // 부른 선수의 이름 순회
        for (String callName : callings) {
            int callerOrder = nameAndOrder.get(callName);
            String prevName = orderAndName.get(callerOrder - 1);

            orderAndName.replace(callerOrder - 1, callName);
            orderAndName.replace(callerOrder, prevName);
            
            nameAndOrder.replace(callName, callerOrder - 1);
            nameAndOrder.replace(prevName, callerOrder);
        }

        for (int order : orderAndName.keySet()) {
            answer[order - 1] = orderAndName.get(order);
        }

        return answer;
    }
}