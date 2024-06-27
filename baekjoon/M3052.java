package baekjoon;
import java.util.*;

public class M3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int count=0,c;
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
			arr[i] %=42;
		}
		for(int i=0; i<10; i++) {
			c=0;
			for(int j=i+1; j<10; j++) {
				if(arr[i] == arr[j]) c++;
			}
			if(c>=1) count++;
		}
		System.out.println(10-count);
		sc.close();
	}
}
