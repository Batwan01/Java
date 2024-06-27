package baekjoon;
import java.io.*;
import java.util.*;
public class M10950 {
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int a,b;
		for(int i=0; i<n ; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			arr[i] = a+b;
		}
		for(int i=0; i<n ; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
