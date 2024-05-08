class Solution {
    public String solution(String myString) {
    	String answer = "";
        char[] aa = myString.toCharArray();
        for(char ch:aa) {
        	if(ch <'l') {
        		ch = 'l';
        	}
        	answer += ch;
        }
        return answer;
    }
}