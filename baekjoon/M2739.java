package baekjoon;
import java.io.*;

public class M2739 {
	public static void main(String[] args)throws IOException {
		int a = System.in.read() - '0';
		for(int i=1; i<10 ; i++) {
			System.out.println(a + " * " + i + " = " + a*i);
		}
	}
}