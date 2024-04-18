import java.util.*;
class Solution {
	public int solution(int k, int[] tangerine) {
		int answer = 0;

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		Arrays.sort(tangerine);

		int before = tangerine[0];
		int cnt = 0;
		
		for (int i : tangerine) {
			if (before == i) {
				cnt++;
			} else {
				pq.add(cnt);
				before = i;
				cnt = 1;
			}
		}

		pq.add(cnt);

		while (k > 0) {

			int n = pq.poll();
			k -= n;

			answer++;
		}

		return answer;
	}
}