import java.io.*;

class Polygon_2 {
	int nPolygon=0;
	class Triangle {
		int height, width;
		Triangle(int height, int width){nPolygon++;}
	}

	class Rectangle {
		int height, width;
		Rectangle(int height, int width){nPolygon++;}
	}

	int getpoly() {
		return nPolygon;
	}
}

class STEP_nPolygon{
	public static void main(String args[])throws IOException {
		Polygon_2 poly = new Polygon_2();
		int height,width;

		height = System.in.read() - '0';
		width = System.in.read() - '0';
		Polygon_2.Triangle Tiran1 = poly.new Triangle(height, width);
		
		height = System.in.read() - '0';
		width = System.in.read() - '0';
		Polygon_2.Triangle Tiran2 = poly.new Triangle(height, width);

		height = System.in.read() - '0';
		width = System.in.read() - '0';
		Polygon_2.Triangle Tiran3 = poly.new Triangle(height, width);
		

		height = System.in.read() - '0';
		width = System.in.read() - '0';
		Polygon_2.Rectangle Rect1= poly.new Rectangle(height, width);


		height = System.in.read() - '0';
		width = System.in.read() - '0';
		Polygon_2.Rectangle Rect2= poly.new Rectangle(height, width);


		height = System.in.read() - '0';
		width = System.in.read() - '0';
		Polygon_2.Rectangle Rect3= poly.new Rectangle(height, width);

		System.out.println(poly.getpoly());
	}
}