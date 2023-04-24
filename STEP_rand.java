import java.io.*;
import java.util.*;

class Random_5 {
	int seed;
	int r0, r1, r2;
	int max;

	Random_5(int seed) { this.seed = seed; }
	void setRnums() {
		Random ran = new Random(seed);
		this.r0 = ran.nextInt(100);
		this.r1 = ran.nextInt(100);
		this.r2 = ran.nextInt(100);
	}

	void setMax() {
		max = r0 > r1 ? r0:r1;
		this.max = max > r2 ? max:r2;
	}

	int outRnums() {
		System.out.println(r0 + " " + r1 + " " + r2);
		return r0 + r1 + r2;
	}

	int getMax() { return max; }
}

class SETP_rand{
	public static void main(String args[])throws IOException{
		Random_5 seed5 = new Random_5(5);
		Random_5 seed7 = new Random_5(7);

		seed5.setRnums();
		seed5.setMax();
		System.out.println(seed5.outRnums());
		System.out.println(seed5.getMax());
		seed7.setRnums();
		seed7.setMax();
		System.out.println(seed7.outRnums());
		System.out.println(seed7.getMax());
	}
}