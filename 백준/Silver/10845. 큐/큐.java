import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();
        
        int count = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            int result = 0;
            
            switch(input[0]) {
                case "push":
                    deque.addLast(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    result = deque.isEmpty() ? -1 : deque.removeFirst();
                    break;
                case "size":
                    result = deque.size();
                    break;
                case "empty":
                    result = deque.isEmpty() ? 1 : 0;
                    break;
                case "front":
                    result = deque.isEmpty() ? -1 : deque.peekFirst();
                    break;
                case "back":
                    result = deque.isEmpty() ? -1 : deque.peekLast();
                    break;
                default:
                    break;
            }
            
            if (!input[0].equals("push")) {
                System.out.println(result);
            }
        }
    }
}