import java.io.*;
class MyRndException_21 extends Exception { }
class MyModException_22 extends Exception { }

class Get_n_2 {
	int getnum() {
		int n;
		try {
			n = (int)(Math.random() * 10);
			System.out.println(n);
			if(n == 0)
				throw new MyRndException_21();
		} catch (MyRndException_21 e) {
			System.out.println("MyRndException_21");
			return -1;
		}
		return (n);
	}
}

class Get_m_2 {
	Get_n_2 gn;

	Get_m_2(Get_n_2 gn) {
		this.gn = gn;
	}

	int getmod() {
		int x,y,m;

		try {
			if((x=gn.getnum()) < 0 || (y=gn.getnum()) < 0 || (m = (x%y)) == 0)
				throw new MyModException_22();
		} catch ( MyModException_22 e) {
			System.out.println("MyMOException_22");
			return -1;
		}
		System.out.printf("<%d %d>",x,y);
		return(m);
	}
}

class STEP_11_Exception_2 {
	public static void main(String args[]) {
		Get_n_2 rd = new Get_n_2();
		Get_m_2 md = new Get_m_2(rd);
		int m;

		while(true) {
			if((m = md.getmod()) < 0)
				break;
			System.out.println("-->"+m);
		}
		System.out.println("Stop...");
	}
}