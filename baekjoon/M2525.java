package baekjoon;
import java.util.*;

public class M2525 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int sum = a*60 + b + c;
			if(sum >= 1440) {
				sum -= 1440;
				System.out.println(sum/60 + " " + sum%60);
			}
			else System.out.println(sum/60 + " " + sum%60);
			sc.close();
	}
}