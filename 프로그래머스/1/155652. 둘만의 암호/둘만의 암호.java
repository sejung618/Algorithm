import java.util.*;

class Solution {
	public String solution(String s, String skip, int index) {
		String answer = "";
		char[] arrs = s.toCharArray();
		char[] arrskip = skip.toCharArray();

		List<Character> list = new ArrayList<>();
		for (char c : arrskip) {
			list.add(c);
		}

		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < index; j++) {
				arrs[i]++;
				if (arrs[i] > 'z') {
					arrs[i] = (char) (arrs[i] - 26);
				}
				while (list.contains(arrs[i])) {
					arrs[i]++;
					if (arrs[i] > 'z') {
						arrs[i] = (char) (arrs[i] - 26);
					}
				}
			}
			answer += arrs[i];
		}

		return answer;
	}

}