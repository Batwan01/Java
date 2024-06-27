import java.io.*;

import static java.lang.System.*;

class Packages {
	public static void main(String args[])throws IOException {
		line.Line_1 line;
		int x, y, a, b, sum;
		x = in.read() - '0'; a = in.read() - '0';
		y = in.read() - '0'; b = in.read() - '0';

		line = new line.Line_1(a,b,x,y);
		sum = line.getnum();

		out.println(sum);
	}
}