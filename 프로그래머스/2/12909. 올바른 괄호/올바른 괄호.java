import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] str = s.split("");
        if(str[0].equals(")") || str[str.length-1].equals("(")) {
        	answer = false;
        	return answer;
        }
        int a = 0;
        int b = 0;
        for (int i = 0; i < str.length; i++) {
			if(str[i].equals("(")) {
				a ++;
			}else {
				b++;
			}
			if(a<b) {
				answer = false;
				return answer;
			}
		}
        System.out.println(a);
        System.out.println(b);
        if(a != b ) {
        	answer = false;
        }

        return answer;
    }
}