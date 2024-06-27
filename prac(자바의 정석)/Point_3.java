package point;

public class Point_3 {
	public int x; 
	public int y;

	public Point_3(int x, int y) { this.x = x; this.y= y; }

	void set_xy(int x, int y) { this.x = x; this.y = y; }
	void set_x(int x) { this.x = x;}
	void set_y(int y) { this.y = y;}
	int get_x() {return x;}
	int get_y() {return y;}
}