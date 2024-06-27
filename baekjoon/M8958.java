package baekjoon;
import java.util.*;

public class M8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int score = 0, count = 0;
		
		for(int i=0; i<N; i++) {
			score = 0; count = 0;
			String word = sc.next();
			for(int j=0; j<word.length(); j++) {
				if(word.charAt(j) == 'O') {
					if(j == 0) {score++; count++;}
					else if (word.charAt(j-1) == word.charAt(j)) {count++; score+=count;}
					else {score++; count++;}
				}
				else if(word.charAt(j) == 'X') count=0;
			}
			System.out.println(score);
		}
		
		
		sc.close();
	}
}
