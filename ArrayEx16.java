import javax.swing.*;

class ArrayEx16 {
	public static void main(String[] args) {
		int answer = (int)(Math.random() * 100)+1;
		int input = 0;
		String temp = "";
		int count = 0;

	do {
		count++;
		temp = JOptionPane.showInputDialog("1~100"+"-1stop");

		if(temp == null || temp.equals("-1")) break;

		input = Integer.parseInt(temp);

		if(answer > input) System.out.println("bigger");
		else if(answer < input) System.out.println("small");
		else
		{
		System.out.println("good("+count+"number)");
		break;
		}
	}while(true);
}}