import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int a = 0;
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(words[0]);
        
        
        for (int i = 1; i < words.length; i++) {
        	if(arr.contains(words[i])) {
        		a= i+1;
        		break;
        	}
        	int len = arr.get(i-1).length();
        	if(arr.get(i-1).charAt(len-1) != words[i].charAt(0)) {
        		a = i+1;
        		break;
        	}
        	arr.add(words[i]);
        }
        
        if(a ==0) {
        	return answer;
        }
        
        if(a%n != 0) {
        	answer[0] = a%n;
        	answer[1] = a/n + 1;
        }else {
        	answer[0] = n;
        	answer[1] = a/n;
        }

        return answer;
    }
}