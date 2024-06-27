package baekjoon;
import java.util.*;

public class M1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int num, max=0, pos=0;
		int[] alpha = new int[26];
		for(int i = 0; i<word.length(); i++) {
			if(word.charAt(i) >= 97) {
				num = word.charAt(i) - 97;
				alpha[num]++;
			}
			else {
				num = word.charAt(i) - 65;
				alpha[num]++;
			}
		}
		for(int i = 0; i<26; i++) {
			max = max>alpha[i] ? max:alpha[i];
			if(max == alpha[i]) pos = i;
		}
		int count = 0;
		for(int i = 0; i<26; i++) {
			if(max == alpha[i]) count++;
		}
		if(count == 1) System.out.printf("%c",pos+65);
		else System.out.println("?");
		sc.close();
	}
}
