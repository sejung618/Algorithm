class Solution {
    public String solution(int age) {
    	String answer = "";
    	String ag = Integer.toString(age);
    	char[] ch = ag.toCharArray();
    	
    	for(char c : ch) {
    		char a = (char) (c + 49);
    		answer += a;
    		
    	}
        return answer;
    }
}