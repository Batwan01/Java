package line;

public class Line_3 extends point.Point_3 {
	int a, b;

	public Line_3(int x, int y, int a, int b) { 
		super(x,y);
		this.a = a; this.b = b;
	}

	void set_xy(int a, int b) { this.a = a; this.b = b; }
	void set_x(int a) { this.a = a;}
	void set_y(int b) { this.b = b;}
	int get_a() {return a;}
	int get_b() {return b;}

	public double get_dl() {
		double dl;
		dl = Math.sqrt(Math.pow(x - a, 2) + Math.pow(y-b,2));
		return (dl);
	}
}