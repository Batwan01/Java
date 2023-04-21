import java.io.*;
import java.util.*;

class npolygon_2{
	static int nPolygon=0;
	class Triangle{
		int width, height;
		
		Triangle(int width, int height) {
			this.width = width;
			this.height = height;
			nPolygon++;
		}
	}
	
	class Rectangle{
		
		int width, height;
	
		Rectangle(int width, int height) {
			this.width = width;
			this.height = height;
			nPolygon++;
		}
	}
	int getnPolygon() {
		return nPolygon;
	}
}

class STEP_03_polygon_2{
	public static void main(String args[]) throws IOException {
		npolygon_2 poly = new npolygon_2();
		
		Scanner sc = new Scanner(System.in);
		int nPolygon, height, width;
		
		height = sc.nextInt();
		width = sc.nextInt();
		npolygon_2.Triangle trian1 = poly.new Triangle(width, height);

		height = sc.nextInt();
		width = sc.nextInt();
		npolygon_2.Triangle trian2 = poly.new Triangle(width, height);

		height = sc.nextInt();
		width = sc.nextInt();
		npolygon_2.Rectangle rectan1 = poly.new Rectangle(width, height);

		height = sc.nextInt();
		width = sc.nextInt();
		npolygon_2.Rectangle rectan2 = poly.new Rectangle(width, height);

		height = sc.nextInt();
		width = sc.nextInt();
		npolygon_2.Rectangle rectan3 = poly.new Rectangle(width, height);
				
		nPolygon = poly.getnPolygon();
		System.out.println("count: " + nPolygon);
	}
}