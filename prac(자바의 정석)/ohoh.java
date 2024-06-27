import java.util.*;
import java.io.*;


class Random_5 {
	int seed;
	int r1, r2, r3;
	int max;

	Random_5(int seed) { this.seed = seed; }
	void setRnums() {
		Random rnd = new Random(seed);
		this.r1 = rnd.nextInt(100);
		this.r2 = rnd.nextInt(100);
		this.r3 = rnd.nextInt(100);
	}

	void setMax() {
		max = r1 > r2 ? r1:r2;
		this.max = max > r3 ? max:r3;
	}

	int outRnums() {
		System.out.println(r1 + "" + r2 + "" + r3);
		return r1+r2+r3;
	}

	int getMax() {
		return max;
	}
}

class STEP_rand {
	public static void main(String args[])throws IOException {
		int sum, max;
		Random_5 seed5 = new Random_5(5);
		seed5.setRnums();
		seed5.setMax();
		sum = seed5.outRnums();
		max = seed5.getMax();
		System.out.println("seed5 sum : " +sum);
		System.out.println("seed5 max : " +max);

		Random_5 seed7 = new Random_5(7);
		seed7.setRnums();
		seed7.setMax();
		sum = seed7.outRnums();
		max = seed7.getMax();
		System.out.println("seed7 sum : " +sum);
		System.out.println("seed7 max : " +max);
	}
}

		
		
		
