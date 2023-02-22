class Solution {
    public String solution(String my_string, int num1, int num2) {
    	
    	StringBuffer sb = new StringBuffer(my_string);
    	
    	char num1Ch = my_string.charAt(num1); 
    	char num2Ch = my_string.charAt(num2); 
    	
    	sb.setCharAt(num1, num2Ch);
    	sb.setCharAt(num2, num1Ch);
    	
    	return sb.toString();
    }
}