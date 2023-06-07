import java.util.*;

class Solution {
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" "); 
        
        
        for (String tmp : arr){
            if (!"".equals(sb.toString())){
                sb.append(" ");
            }
            
            if (tmp.length() > 0){
                sb.append(tmp.substring(0,1).toUpperCase()); 
                
                if (tmp.length() > 1){
                    sb.append(tmp.substring(1).toLowerCase());
                }
            }
        }
        
        if (s.length() > sb.toString().length()){
            sb.append(" ");
        }
        
        return sb.toString();
    }
}