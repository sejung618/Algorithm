class Solution {
	public int solution(int n, int a, int b) {
		int answer = 0;
		String maxa = Integer.toBinaryString(n);
		int max = maxa.length() - 1;
		int numa = a>b ? b:a;
		int numb = a>b ? a:b;
		
		for (int i = 0; i < max; i++) {

			if (numa > Math.pow(2, max - 1 - i) && numb > Math.pow(2, max - 1 - i)) {
				numa = (int) (numa - Math.pow(2, max -1- i));
				numb = (int) (numb - Math.pow(2, max -1- i));
			}

			if (numa <= Math.pow(2, max - 1 - i) && numb <= Math.pow(2, max - 1 - i)) {
				continue;
			}

			if (numa <= Math.pow(2, max - 1 - i) && numb > Math.pow(2, max - 1 - i)) {
				return max - i;
			}

		}

		return answer;
	}
}