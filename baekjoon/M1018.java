package baekjoon;
import java.util.*;

public class M1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt(); //N*M
		sc.nextLine();
		if(N != M) {sc.close(); return;} 
		
		String[][] word = new String[M][M]; //비교

		//-----------------------------------------------
		String[][] white = new String[8][8]; //화이트 스타트
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(i%2 == 0) {
					if(j%2 == 0) white[i][j] = "W";
					else white[i][j] = "B";
				}
				else {
					if(j%2 == 1) white[i][j] = "W";
					else white[i][j] = "B";
				}
			}
		}
		
		//----------------------------------------------
		String[][] black = new String[8][8]; //블랙 스타트
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(i%2 == 0) {
					if(j%2 == 0) black[i][j] = "B";
					else black[i][j] = "W";
				}
					if(j%2 == 1) black[i][j] = "B";
					else black[i][j] = "W";
			}
		}
		
		//-----------------------------------------------입력받음

		for(int i = 0; i<N; i++) {
			word[i] = sc.nextLine().split(""); 
		}
		sc.close();

		//----------------------------------------------비교
		int count, h=0, k=0, max_w=0, max_b=0, c=0, r=0;
		while(h+8<=N) {
			k=0;
			while(k+8<=M) { //화이트 비교
				count = 0;
				for(int i=h; i<8+h; i++) {
					r=0;
					for(int j=k; j<8+k; j++) {
						if(white[c][r].equals(word[i][j])) count ++;
						r++;
					}
					c++;
				}
				if(max_w<count) max_w = count;
				k++;
			}
			h++; 
		}
		
		h=0; k=0; c=0; r=0;
		while(h+8<=N) {
			k=0;
			while(k+8<=M) { //블랙 비교
				count = 0;
				for(int i=h; i<8+h; i++) {
					r=0;
					for(int j=k; j<8+k; j++) {
						if(black[c][r].equals(black[i][j])) count ++;
						r++;
					}
					c++;
				}
				if(max_b<count) max_b = count;
				k++;
			}
			h++;
		}
		System.out.print(max_w>max_b ? max_w:max_b);
	}
}