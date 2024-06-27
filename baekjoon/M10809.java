package baekjoon;
import java.util.*;

public class M10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int[] arr = new int[26];
		for(int i=0; i<26; i++) {
			arr[i] = -1;
		}
		for(int i=0; i<word.length(); i++) {
			if(arr[word.charAt(i)-'a'] == -1) arr[word.charAt(i)-'a'] = i;
		}
		for(int i=0; i<26; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
