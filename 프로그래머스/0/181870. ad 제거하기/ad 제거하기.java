import java.util.*;
class Solution {
    public List<String> solution(String[] strArr) {
    	List<String> aa = new ArrayList<String>();
    	for (int i = 0; i < strArr.length; i++) {
			if(!strArr[i].contains("ad")) {
				aa.add(strArr[i]);
			}
		}
    	
        
        return aa;
    }
}