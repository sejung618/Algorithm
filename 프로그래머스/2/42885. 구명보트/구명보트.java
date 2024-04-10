import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        ArrayList<Integer> list = new ArrayList<>();
        for (int w : people) {
            list.add(w);
        }
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            if (list.get(left) + list.get(right) <= limit) {
                left++;
            }
            right--;
            answer++;
        }

        return answer;
    }
}