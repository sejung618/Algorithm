class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        
    	String answer = "";
        char[] ch = my_string.toCharArray();
        char a= ch[num1];
        char b = ch[num2];
        ch[num1] = b;
        ch[num2] = a;
        
        for(char c :ch) {
        	answer += c;
        }
        
        return answer;
    }
}