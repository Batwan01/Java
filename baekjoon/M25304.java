package baekjoon;
import java.util.*;

public class M25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int n = sc.nextInt();
		int a, b, sum=0;
		for(int i=0 ; i<n ; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum += a*b;
		}
		if(sum == total) System.out.print("Yes");
		else System.out.print("No");
		sc.close();
	}
}
