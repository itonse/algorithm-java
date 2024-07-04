import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = s.length();

        for(int i = 0; i < s.length(); i++) {
            String temp = s.substring(i, s.length());
            if(isPalindrome(temp)) {
                break;
            }
            cnt++;
        }

        System.out.println(cnt);
        
        sc.close();
    }
}