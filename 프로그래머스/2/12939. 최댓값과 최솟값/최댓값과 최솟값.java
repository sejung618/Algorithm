import java.util.*;
class Solution {
    public String solution(String s) {
    	String answer = "";
        String[] b = s.split(" ");
        
        int[] zzz= new int[b.length];
		for (int i = 0; i < b.length; i++) {
			int c= Integer.parseInt(b[i]);
			zzz[i] = c;
		}
		int max = Arrays.stream(zzz).max().getAsInt();
		int min = Arrays.stream(zzz).min().getAsInt();
		String strmax = Integer.toString(max);
		String strmin = Integer.toString(min);
		
		answer = strmin +" " +strmax;
        
        return answer;
    }
}