class Solution {
    public int solution(int n, int m, int[] section) {
    		int answer = 0;
    		int frog =1;
    		for(int a:section) {
    			if(frog<=a) {
    				answer++;
    				frog=a+m;
    			}
    		}
    		
    		
    		
    		
    		
        return answer;
    }
}