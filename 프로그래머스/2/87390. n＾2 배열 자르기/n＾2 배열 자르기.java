class Solution {
    public int[] solution(int n, long left, long right) {
        
        int size = (int)(right - left + 1);
        int[] answer = new int[size];
        
        
        for (long i = left; i <= right; i++) {
            int index = (int)(i - left);
            int row = (int)(i / n);
            int col = (int)(i % n);
            answer[index] = Math.max(row, col) + 1;
        }
        
        return answer;
    }
}