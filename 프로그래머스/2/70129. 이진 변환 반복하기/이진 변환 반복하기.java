class Solution {
    public int[] solution(String s) {
        String[] str= s.split("");
        
        int num = 0;
        int dud = 0;
        
        while(str.length != 1) {
        	int aa = 0;
        	for (int i = 0; i < str.length; i++) {
        	if(str[i].equals("0")) {
        		dud ++;
        		aa++;
        	}
        }
        int bb = str.length - aa;
        String binary = Integer.toBinaryString(bb);
    	str = binary.split("");
    	num ++;
        }
    	
    	int[] answer = new int[2];
    	answer [0] = num;
    	answer[1] = dud;
        return answer;
    }
}