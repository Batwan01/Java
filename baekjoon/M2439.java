package baekjoon;
import java.util.*;


public class M2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j;
		for(int i=1; i<=n ; i++) {
			for(j=0 ; j<n-i ; j++) {
				System.out.print(" ");
			}
			for(; j<n ; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		sc.close();
	}
}

