import java.util.*;
class Solution {
	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];

		int total = brown + yellow;
		int sqrt = (int) Math.sqrt(total);
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 1; i <= sqrt; i++) {
			if (total % i == 0) {
				arr.add(i);
				if (total / i != i) {
					arr.add(total / i);
				}
			}
		}
		arr.sort(Comparator.naturalOrder());

		for (int i = 0; i <= arr.size() / 2; i++) {
			if ((arr.get(i) - 2) * ((arr.get(arr.size() - 1 - i)) - 2) == yellow) {
				answer[0] = arr.get(arr.size() - 1 - i);
				answer[1] = arr.get(i);
                break;
			}
		}

		return answer;
	}
}