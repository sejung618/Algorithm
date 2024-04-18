class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
        	String news = s.substring(1) + s.substring(0, 1);
        	s = news;
        	String ss = news;
			
        	for (int j = 0; j < 500; j++) {
				ss = ss.replace("()", "");
				ss = ss.replace("{}", "");
				ss = ss.replace("[]", "");
			}
        	if(ss.length()==0) {
        		answer ++;
        	}
        	
        
        }
        return answer;
    }
}