package baekjoon;

import java.util.*;

public class M11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,b;
		for(int i=0; i<n ; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i+1, a, b, a+b);
		}
		sc.close();
	}
}
