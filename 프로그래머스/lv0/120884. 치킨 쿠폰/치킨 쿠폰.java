class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int service_chicken = 0;
        int num = 0;

        int service_coupon = chicken;

        while(service_coupon > 9) {
            num = service_coupon / 10;
            answer += num;
            service_coupon %= 10;
            service_coupon += num;
        }
        
        return answer;
    }
}