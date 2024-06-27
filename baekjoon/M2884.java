package baekjoon;
import java.util.*;
public class M2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int time;
		time = a*60 + b - 45;
		if(time<0) {
			time = time+1440;
			a = time/60;
			b = time - a*60;
			System.out.printf("%d %d",a, b);
		}
		else {
			a = time/60;
			b = time - a*60;
			System.out.printf("%d %d",a, b);
		}
		sc.close();
	}
}
