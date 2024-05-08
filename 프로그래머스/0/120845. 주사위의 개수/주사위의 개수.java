class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        answer = box[0]/n *answer;
        answer = box[1]/n *answer;
        answer = box[2]/n *answer;
        return answer;
    }
}