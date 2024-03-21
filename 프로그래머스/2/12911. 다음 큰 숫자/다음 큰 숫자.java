class Solution {
    public int solution(int n) {
    	int num = 0;
    	String binary = Integer.toBinaryString(n);
    	for (int i = 0; i < binary.length(); i++) {
			if(binary.charAt(i) == '1') {
				num ++;
			}
		}
    	int num1 =0;
    	while(num != num1) {
    		num1 =0;
        	n +=1;
        	String binary1 = Integer.toBinaryString(n);
        	for (int i = 0; i < binary1.length(); i++) {
    			if(binary1.charAt(i) == '1') {
    				num1 ++;
    			}if(num<num1) {
    				break;
    			}
    		}
        }
        return n;
    }
}