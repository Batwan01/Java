package baekjoon;
import java.util.*;

public class M2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max=0, count = 0;
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<9; i++) {
			max = max > arr[i] ? max:arr[i];
			if(max == arr[i]) count = i+1;
		}
		System.out.print(max + "\n" + count);
		sc.close();
	}
}
