package baekjoon;
import java.util.Scanner;

public class M2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine(); //단어 입력받기
		int length = word.length(); //영어 글자수
		int count = 0; //크로아티아 글자수
		
		for(int i=0; i<length; i++) 
		{
			if(i+1 >= length) { count++; break; } //마지막 글자는 비교하지 않고 종료
			switch (word.charAt(i)) { //시작하는 단어
			case 'c':
				if(word.charAt(i+1) == '=') { count++; i++; break; }
				else if(word.charAt(i+1) == '-') { count++; i++; break; }
				else { count++; break; }
			case 'd':
				if(word.charAt(i+1) == 'z') 
				{ 
					if(i+2 >= length ) { count+=2; i++; break; }
					if(word.charAt(i+2) == '=') 
					{
						{ count++; i+=2; break; } //dz=면 글자수 +1, i+=2
					}
					else { { count+=2; i++; break; } } //dz=가 아니면 글자수 +2, i +1
				}
				else if(word.charAt(i+1) == '-' ) { count++; i++; break;}
				else { count++; break; }
			case 'l':
				if(word.charAt(i+1) == 'j') { count++; i++; break; }
				else { count++; break; }
			case 'n':
				if(word.charAt(i+1) == 'j') { count++; i++; break; }
				else { count++; break; }
			case 's':
				if(word.charAt(i+1) == '=') { count++; i++; break; }
				else { count++; break; }
			case 'z':
				if(word.charAt(i+1) == '=') { count++; i++; break; }
				else { count++; break; }
			default:
				count++;
				break;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
