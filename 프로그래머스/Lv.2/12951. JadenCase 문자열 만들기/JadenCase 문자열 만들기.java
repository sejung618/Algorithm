class Solution {
    public String solution(String s) {
        String answer = "";
        s= s.toUpperCase();
        String[] b = s.split("");
        
        for (int i = 1; i < b.length; i++) {
			b[0]= b[0].toUpperCase(); 
        	if(!b[i-1].equals(" ")){
				b[i] =b[i].toLowerCase();
			}
		}
        
        for (int i = 0; i < b.length; i++) {
			answer += b[i];
		}
        
        return answer;
    }
}