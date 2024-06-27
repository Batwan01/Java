package baekjoon;
import java.io.*;
import java.util.*;
public class M11021 {
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int  T = sc.nextInt();
		int[] nums = new int[T];
		int a,b;
		for(int i=0; i<T ; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			nums[i] = a + b;
		}
		for(int i=0; i<T ; i++) {
			System.out.printf("Case #%d: %d\n",i+1,nums[i]);
		}
		sc.close();
	}
}
