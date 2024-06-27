package main;
import java.util.*;

public class M10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int floor, number;
		for(int i=0; i<T; i++)
		{
			floor = 0;
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			if(N%H == 0) 
			{
				floor = H*100; //층수 구하기
				number = N/H; //호수 구하기
			}
			else 
			{
				floor = N%H*100; //층수 구하기
				number = N/H +1; //호수 구하기
			}
			
			System.out.print(floor + number);
		}
		
		sc.close();
	}
}
