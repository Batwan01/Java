package line;

public class Line_1 extends point.Point_1 {
	public int a;
	public int b;
	public Line_1(int a, int b, int x, int y) {
		super(x,y);
		this.a = a; this.b = b;
	}

	public int getnum() {
		int sum = a+b+x+y;
		return sum;
	}
}