package baekjoon;
import java.util.*;

public class M1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] arr = new double[N];
		int max=0;
		double sum=0;
		for(int i=0; i<N; i++) {
			int a = sc.nextInt();
			arr[i] = a;
			max = max>a ? max:a; 
		}
		for(int i=0; i<N; i++) {
			arr[i] = arr[i]/max*100;
		}
		for(int i=0; i<N; i++) {
			sum += arr[i];
		}
		System.out.print(sum/N);
		sc.close();
	}
}
