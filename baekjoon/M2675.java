package baekjoon;
import java.util.*;

public class M2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String word = sc.nextLine();
            for (int j = R; j < R * word.length(); j++) {
                System.out.print(word.charAt(j / R));
            }
            System.out.println();
        }

        sc.close();
    }
}
