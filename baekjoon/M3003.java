package baekjoon;
import java.util.*;

public class M3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] com = {1, 1, 2, 2, 2, 8};
		int[] have = new int[6];
		for(int i=0; i<6; i++) {
			have[i] = sc.nextInt();
			if(com[i] == have[i]) com[i] = 0;
			else com[i] = com[i] - have[i];
		}
		for(int i=0; i<6; i++) {
			System.out.print(com[i] + " ");
		}
		sc.close();
	}
}
