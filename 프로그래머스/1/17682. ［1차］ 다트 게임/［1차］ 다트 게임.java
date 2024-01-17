import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] in = new int[3];
        int in1 = 0;
        for (int i = 0; i < dartResult.length(); i++) {
        	if(dartResult.charAt(i)>=48 && dartResult.charAt(i)<=57) {  
        	in[in1] = i;
        	in1++;
                if(dartResult.charAt(i)==49) {
        		i++;
        	}
            }
		}
        String[] st = new String[3];
        st[0] = dartResult.substring(in[0], in[1]);
        st[1] = dartResult.substring(in[1], in[2]);
        st[2] = dartResult.substring(in[2]);        

        int[] ans = new int[3];
        
        for (int i = 0; i < st.length; i++) {
        	char[] ch = st[i].toCharArray();
        	if(ch[1] =='0') {
        		int zxc = Integer.parseInt(st[i].substring(0, 2)); 
        		
        		switch(ch[2]) {
    			case 'S':
    				ans[i] = (int) Math.pow(zxc, 1);
    				break;
    			case 'D':
    				ans[i] = (int)Math.pow(zxc, 2);
    				break;
    			case 'T':
    				ans[i] = (int)Math.pow(zxc, 3);
    				break;
    				}
        		try {
        			if(ch[3]=='*') {
        				ans[i] = ans[i] *2;
                        ans[i-1] = ans[i-1] *2;
        				
        			}
        			if(ch[3]=='#') {
        				ans[i] = ans[i] *(-1);
        			}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
        		      			        		
        	}else {
        	
        		int zxc = Integer.parseInt(st[i].substring(0, 1)); 
        	switch(ch[1]) {
			case 'S':
				ans[i] = (int) Math.pow(zxc, 1);
				break;
			case 'D':
				ans[i] = (int)Math.pow(zxc, 2);
				break;
			case 'T':
				ans[i] = (int)Math.pow(zxc, 3);
				break;
			}
        	try {
        		if(ch[2]=='*') {
        			ans[i] = ans[i] *2;
                    ans[i-1] = ans[i-1] *2;
        			
        			
        		}
        		if(ch[2]=='#') {
        			ans[i] = ans[i] *(-1);
        		}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
        	
        	}
			
			
		}
        
        for(int q:ans)
        	answer += q;
        
        return answer;
    }
}
