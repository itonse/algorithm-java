import java.io.*;
import java.util.*;

public class Main {
    public static int calculateTotalMinute(String[] strArr) {
        return Integer.parseInt(strArr[0]) * 60 + Integer.parseInt(strArr[1]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> attendance = new HashMap<>();

        String[] timeSet = br.readLine().split(" ");

        int startTotalMinute = calculateTotalMinute(timeSet[0].split(":"));
        int endTotalMinute = calculateTotalMinute(timeSet[1].split(":"));
        int closedTotalMinute = calculateTotalMinute(timeSet[2].split(":"));

        String input;
        while ((input = br.readLine()) != null) {
            if (input.length() == 0) {
                break;  // 빈 줄이 입력된 경우 종료
            }

            String[] str = input.split(" ");
            String[] writtenTime = str[0].split(":");
            String name = str[1];

            int totalMinute = Integer.parseInt(writtenTime[0]) * 60 + Integer.parseInt(writtenTime[1]);

            if (startTotalMinute >= totalMinute) {
                attendance.put(name, 1);
            } else if (endTotalMinute <= totalMinute && totalMinute <= closedTotalMinute) {
                if (attendance.get(name) != null && attendance.get(name) == 1) {
                    attendance.put(name, 2);
                }
            } else if (closedTotalMinute < totalMinute) {
                break;
            }
        }

        int answer = 0;
        Set<String> nameSet = attendance.keySet();

        for (String name : nameSet) {
            if (attendance.get(name) == 2) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}