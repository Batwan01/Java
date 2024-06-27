class Pointtest {
	public static void main(String args[]) {
		Point3d p3 = new Point3d(1,2,3);
	}
}

class Point { 
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getlocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3d extends Point {
	int z;
	Point3d(int x, int y, int z) {
           /* this.x = x;
	this.y = y;  >> err */ 
	super(x, y);
	this.z = z;
}


	String getlocation() {
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}

