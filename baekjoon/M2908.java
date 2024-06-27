package baekjoon;
import java.util.*;

public class M2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int one = 0, two = 0, three = 0;
		one = num1%10;
		two = (num1 - one)%100;
		three = num1 - one - two;
		num1 = one*100 + two + three/100;
		
		one = num2%10;
		two = (num2 - one)%100;
		three = num2 - one - two;
		num2 = one*100 + two + three/100;
		System.out.print(num1>num2 ? num1:num2);
		sc.close();
	}
}
