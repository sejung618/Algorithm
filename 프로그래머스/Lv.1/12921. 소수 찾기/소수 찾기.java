class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i+=2) {
        	int con = 0;
			for (int j = 1; j <= Math.sqrt(i); j+=2) {
				if(i%j ==0) {
					con++;
				}
				if(con ==2) {
					break;
				}
			}
        	if(con ==1) {
        		answer ++;
        	}
        	
		}

        return answer;
    }
}