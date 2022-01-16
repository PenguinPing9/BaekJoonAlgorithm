package BaekJoon;
import java.util.*;

public class baekjoon2839 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int cnt = 0;
		
		while(n >= 3) {
			if(n % 5 == 0) {
				n -= 5;
				cnt++;
			}
			
			else if(n % 3 == 0) {
				n -= 3;
				cnt++;
			}
			
			else {
				n -= 3;
				cnt++;
			}
		}
		
		if(n == 0) 
			System.out.println(cnt);
		else 
			System.out.println("-1");
	}
}
