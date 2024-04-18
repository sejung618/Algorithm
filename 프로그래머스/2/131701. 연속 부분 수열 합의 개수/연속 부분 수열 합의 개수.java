import java.util.*;
class Solution {
	public int solution(int[] elements) {
		Set<Integer> s = new HashSet<Integer>();

		for (int i = 1; i <= elements.length; i++) {

			for (int k = 0; k < elements.length; k++) {

				int sum = 0;
				for (int j = 0; j < i; j++) {
					int qq = k + j;
					if (qq >= elements.length) {
						qq = qq - elements.length;
					}
					sum += elements[qq];
				}
				s.add(sum);
				
			}
		}
		
		return s.size();
	}
}