package baekjoon;
import java.util.*;

public class M2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a*b*c;
		int[] count = new int[10];
		String num = Integer.toString(sum);
		for(int i=0; i<num.length(); i++) {
			count[num.charAt(i) - 48]++;
		}
		for(int i=0; i<10; i++) {
			System.out.println(count[i] + " ");
		}
		
		sc.close();
	}
}
