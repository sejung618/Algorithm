import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        String[] w = new String[10];
        int k = 0;
        for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i]; j++) {
				w[k] = want[i];
				k++;
			}
		}
        Arrays.sort(w);
        for (int i = 0; i < discount.length-9; i++) {
        	String[] con = new String[10];
			int x = 0;
        	for (int j = i; j < i+10; j++) {
				con[x] = discount[j];
				 x++;
			}
        	Arrays.sort(con);
        	
        	int t = 0;
        	for (int j = 0; j < con.length; j++) {
        		if(w[j].equals(con[j])) {
					t++;
				
				}
        		if(t == 10) {
        			answer ++;
        		}
			}
        }
        
        return answer;
    }
}