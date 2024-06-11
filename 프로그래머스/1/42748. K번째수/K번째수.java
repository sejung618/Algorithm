import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int y = 0;
        for(int[] arr: commands) {  //253
        	int[] tmp = new int[arr[1]-arr[0]+1];
        	int k =0;
        	for (int i = arr[0]-1; i < arr[1]; i++) {
				tmp[k] = array[i];
				k++;
			}
        	Arrays.sort(tmp);
        	answer[y] = tmp[arr[2]-1];
        	y++;
        }
        
        return answer;
    }
}