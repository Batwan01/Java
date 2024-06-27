package baekjoon;
import java.util.*;

public class M2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[8];
		int count=0;
		for(int i=0; i<8; i++) {
			num[i] = sc.nextInt();
		}
		for(int i=0; i<7; i++) {
			if(num[0] == 1) {
				if(num[i] - num[i+1] == -1) count++;
			}
			else if(num[0] == 8) {
				if(num[i] - num[i+1] == 1) count--;
			}
			else break;
		}
		if(count == 7) System.out.print("ascending");
		else if(count == -7) System.out.print("descending");
		else System.out.print("mixed");
		sc.close();
	}
}
