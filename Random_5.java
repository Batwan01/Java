import java.util.*;
import java.io.*;

class Random_5{
	int seed;
	int rnum0, rnum1, rnum2;
	int max;

	Random_5(int seed){
		this.seed = seed;
	}

	void setRnums() {
		Random rnd = new Random(seed);
		this.rnum0 = rnd.nextInt(100);
		this.rnum1 = rnd.nextInt(100);
		this.rnum2 = rnd.nextInt(100);
	}

	void setMax() {
		max = rnum0 > rnum1 ? rnum0:rnum1;
		this.max = max > rnum2 ? max:rnum2;
	}

	int outRnums() {
		System.out.println("seed " + seed + " : " +rnum0 +","+ rnum1 +","+ rnum2);
		return rnum0+rnum1+rnum2;
	}

	int getMax() {
		return max;
	}
}

class STEP_05_Random_5{
	public static void main(String args[]) throws IOException {
		Random_5 seed5 = new Random_5(5);
		Random_5 seed7 = new Random_5(7);

		int max5, max7, sum5, sum7;

		seed5.setRnums();
		seed5.setMax();
		sum5 = seed5.outRnums();
		max5 = seed5.getMax();
		System.out.println("max : " + max5);

		seed7.setRnums();
		seed7.setMax();
		sum7 = seed7.outRnums();
		max7 = seed7.getMax();
		System.out.println("max : " + max7);
	}
}