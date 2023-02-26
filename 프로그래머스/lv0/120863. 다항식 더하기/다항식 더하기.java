class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        int coe = 0;
        int x_coe = 0;
        String str_tmp = "";

        for(int i = 0; i < arr.length; i += 2) {
            if(i == 0) {
                if(arr[i].charAt(0) == 'x') {
                    x_coe += 1;
                } else if(arr[i].charAt(arr[i].length() - 1) == 'x') {
                    str_tmp = arr[i].substring(0, arr[i].length() - 1);
                    x_coe += Integer.parseInt(str_tmp);
                } else {
                    coe += Integer.parseInt(arr[i]);
                }
            } else {
                if(arr[i - 1].equals("+")) {
                    if(arr[i].charAt(0) == 'x') {
                        x_coe += 1;
                    } else if(arr[i].charAt(arr[i].length() - 1) == 'x') {
                        str_tmp = arr[i].substring(0, arr[i].length() - 1);
                        x_coe += Integer.parseInt(str_tmp);
                    } else {
                        coe += Integer.parseInt(arr[i]);
                    }
                } else if (arr[i - 1].equals("-")) {
                    if(arr[i].charAt(0) == 'x') {
                        x_coe -= 1;
                    } else if(arr[i].charAt(arr[i].length() - 1) == 'x') {
                        str_tmp = arr[i].substring(0, arr[i].length() - 1);
                        x_coe -= Integer.parseInt(str_tmp);
                    } else {
                        coe -= Integer.parseInt(arr[i]);
                    }
                }
            }
        }

        if(x_coe != 0) {
            if(x_coe != 1) {
                answer += Integer.toString(x_coe);
            }
            
            answer += 'x';
        }
        if(x_coe == 0 && coe != 0) {
            answer += Integer.toString(coe);
        } else if (x_coe != 0 && coe != 0){
            if(coe < 0) {
                answer += " - ";
                answer += Integer.toString(-coe);
            } else {
                answer += " + ";
                answer += Integer.toString(coe);
            }
        } else if (x_coe == 0 && coe == 0) {
            answer += '0';
        }
        
        return answer;
    }
}