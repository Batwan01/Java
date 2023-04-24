import java.io.*;
import java.util.*; //rand함수

class Random_5 {
	int seed;
	int r0, r1, r2;
	int max;

	Random_5(int seed) { this.seed = seed; } //연산자 필수 this.잊지 않게
	void setRnums() {
		Random ran = new Random(seed); //random(5)는 항상 고정값임 random(7)은 또 7대로 고정값
		this.r0 = ran.nextInt(100);
		this.r1 = ran.nextInt(100);
		this.r2 = ran.nextInt(100);
	}

	void setMax() {
		max = r0 > r1 ? r0:r1; //이건 알아서 최댓값 구하기
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

		seed5.setRnums(); //함수들 다 한번씩 실행해줘야함
		seed5.setMax();
		System.out.println(seed5.outRnums());
		System.out.println(seed5.getMax());
		seed7.setRnums();
		seed7.setMax();
		System.out.println(seed7.outRnums());
		System.out.println(seed7.getMax());
	}
}