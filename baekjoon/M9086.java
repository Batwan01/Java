package baekjoon;
import java.util.*;

public class M9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			word = sc.next();
			System.out.println(word.charAt(0) +""+ word.charAt(word.length()-1));
		}
		sc.close();
	}
}
