import java.io.*;

class STEP_07_PointLine_3 {
	public static void main(String args[]) throws IOException {
		line.Line_3 line;
		int x,y,a,b;
		double dl;

		x = System.in.read() - '0'; y=System.in.read() - '0';
		a = System.in.read() - '0'; b=System.in.read() - '0';

		line = new line.Line_3(x, y, a, b);

		dl = line.get_dl();
		System.out.printf("dl=%f\n", dl);
	}
}