import java.io.*;

import kor.point.*;

class Line_6 extends Point_6 {
	int a, b;

	Line_6(int x, int y, int a, int b) {
		super(x, y);
		this.a = a; this.b = b;
	}
	int get_a() { if(a<0) return 0; else return a; }
	int get_b() { if(b<0) return 0; else return b; }

	public	int get_x() { 
		if(super.get_x()>0) return (super.get_x());
		else return (0);
	}

	public	int get_y() {
		if (super.get_y() > 0) return (super.get_x());
		else return (0);
	}

	public double get_dl() {
		double dl;
		dl = Math.sqrt(Math.pow(get_x() - a,2)+ Math.pow(get_y() - b,2));
		return (dl);
	}
}