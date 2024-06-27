package baekjoon;
import java.util.*;

public class M2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num=0, sum=0;
		for(int i=0; i<5; i++) {
			num = Math.pow(sc.nextInt(),2);
			sum+=num;
		}
		System.out.print((int)sum%10);
		sc.close();
	}
}
