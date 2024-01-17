import java.util.*;
class Solution {
	public int solution(String[] babbling) {
		int answer = 0;
		// 변수 지정
		String aya = "aya";
		String ye = "ye";
		String woo = "woo";
		String ma = "ma";
		for (int i = 0; i < babbling.length; i++) {// 변수를 숫자로 바꾸기
			babbling[i] = babbling[i].replaceAll(aya, "1");
			babbling[i] = babbling[i].replaceAll(ye, "2");
			babbling[i] = babbling[i].replaceAll(woo, "3");
			babbling[i] = babbling[i].replaceAll(ma, "4");
		}

		for (int i = 0; i < babbling.length; i++) {
			try {
				int aa = Integer.parseInt(babbling[i]);
				answer++;
				char[] ch = babbling[i].toCharArray();
				if(ch.length>1) {
					for (int j = 1; j < ch.length; j++) {
						if((int) ch[j] == (int) ch[j-1]) {
							answer--;
                            break;
						}
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		return answer;
	}
}