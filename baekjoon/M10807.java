package baekjoon;
import java.util.*;

public class M10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		for(int i=0; i<N ; i++) {
			if(arr[i] == v) count++;
		}
		
		System.out.print(count);
		sc.close();
	}
}
