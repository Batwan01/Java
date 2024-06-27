
 /* Ref_3.txt ==> 181 page, STEP_15_IO_5.java */
 
 import	java.io.*;
 import	java.util.*;

 class IO_53 {
	void io_test() {

		Scanner	scan = null;

		try {
			scan = new Scanner(new File("data.txt"));
		} catch (FileNotFoundException e) {
			System.err.println
				    ("Can't open 'data.txt' for input...");
			System.exit(1);
		}

		scan.useDelimiter("[ ,\t\n\r]+");
					
		while(scan.hasNext()) {
			String	word = scan.next();
			System.out.println(word);
		}
	}
 }

public class STEP_15_IO_5 {
	public static void main(String args[]) {
		new IO_53().io_test();
	}
}