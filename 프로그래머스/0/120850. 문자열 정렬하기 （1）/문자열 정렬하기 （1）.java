import java.util.*;
class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> list = new ArrayList<Integer>();
    	for (int i = 0; i < my_string.length(); i++) {
			if(my_string.charAt(i) <='9') {
				int aa = my_string.charAt(i);
				list.add(aa-48);
			}
		}
    	list.sort(null);
        
        return list;
    }
}