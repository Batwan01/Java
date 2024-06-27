import java.io.*;

class STEP_08_PointLine_6 {
	public static void main(String args[]) throws IOException {
		Line_6 line;
		int x, y, a, b;
		double dl;
		x=System.in.read() - '0';  y = System.in.read() - '0';
		a=System.in.read() - '0'; b = System.in.read() - '0';

		line = new Line_6(x, y, a, b);
		dl = line.get_dl();
		System.out.printf("dl=%f\n",dl);
	}
}