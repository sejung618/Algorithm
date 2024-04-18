class Solution {
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
        	String news = s.substring(1) + s.substring(0, 1);
        	s = news;
			
        	if(s.contains("(}") ||s.contains("(]")||s.contains("[}")||s.contains("[)")
					||s.contains("{)")||s.contains("{]")) {
				continue;
			}
        	int a = 0;
        	int b = 0;
        	int c = 0;
        	int d = 0;
        	int e = 0;
        	int f = 0;
        	for (int j = 0; j < s.length(); j++) {
        		if(s.charAt(j)=='(') {
					a++;
				}
				if(s.charAt(j)==')') {
					b++;
				}
				if(s.charAt(j)=='{') {
					c++;
				}
				if(s.charAt(j)=='}') {
					d++;
				}
				if(s.charAt(j)=='[') {
					e++;
				}
				if(s.charAt(j)==']') {
					f++;
				}
				
				if(a<b || c<d || e<f) {
					break;
				}
			}
        
        	if(a==b && c==d && e==f  ) {
        		answer++;
        	}
        	
        	
		}
        
        
        return answer;
    }
}