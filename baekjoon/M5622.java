package baekjoon;
import java.util.*;

public class M5622 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String word = sc.next();
		int n,time=0;
		for(int i=0; i<word.length(); i++) {
			n = word.charAt(i);
			switch(n) {
				case 65: case 66: case 67:
					time += 3;
					break;
				case 68: case 69: case 70:
					time += 4;
					break;
				case 71: case 72: case 73:
					time += 5;
					break;
				case 74: case 75: case 76:
					time += 6;
					break;
				case 77: case 78: case 79:
					time += 7;
					break;
				case 80: case 81: case 82: case 83:
					time += 8;
					break;
				case 84: case 85: case 86:
					time += 9;
					break;
				case 87: case 88: case 89: case 90:
					time += 10;
					break;
			}
		}
		System.out.print(time);
		sc.close();
	}
}
