package BaekJoon;
import java.util.*;

public class baekjoon1157 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		int[] alphaNum = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			for(char j = 'a'; j <= 'z'; j++)
				if(str.charAt(i) == j) alphaNum[j - 'a']++;
			for(char k = 'A'; k <= 'Z'; k++)
				if(str.charAt(i) == k) alphaNum[k - 'A']++;
		}
		
		
		int max = 0;
		char ch = 0;
		boolean dist = false;
		for(int i = 0; i < 26; i++) {
			if(max == alphaNum[i]) dist = true;
			if(max < alphaNum[i]) {
				max = alphaNum[i];
				ch = (char)('A' + i);
				dist = false;
			}
		}
		
		if(dist) System.out.println("?");
		else System.out.println(ch);
	}
}