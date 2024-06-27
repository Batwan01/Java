package baekjoon;
import java.util.*;

public class M1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int count = 0;
		if(word.charAt(0) == ' ' ) count--;
		if(word.charAt(word.length()-1) == ' ') count--;
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i) == ' ') count++;
		}
		System.out.print(count+1);
		sc.close();
	}
}
