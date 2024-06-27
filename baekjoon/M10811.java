package baekjoon;
import java.util.*;
public class M10811{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] basket = new int[N+1];
		int[] arr = new int[N+1];
		for(int i=1; i<=N; i++) {
			basket[i] = i;
			arr[i] = i;
		}
		
		for(int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int j=b; j>=a; j--) {
				basket[a+b-j] = arr[j];
			}
			for(int j=1; j<=N; j++) {
				arr[j] = basket[j];
			}
		}
		for(int i=1; i<=N; i++) {
			System.out.print(basket[i]+" ");
		}
		sc.close();
	}
}
