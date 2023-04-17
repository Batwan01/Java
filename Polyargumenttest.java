class Product {
	int price; //제품의 가격
	int bonuspoint; //보너스 점수

	Product(int price) {
		this.price = price;
		bonuspoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(100); //조상클래스의 생성장 Product(int price)를 호출, tv의 가격 100
	}

	public String toString() { //object클래스의 toString()을 오버라이딩한다.
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "computer";
	}
}

class Buyer {
	int money = 1000;
	int bonuspoint = 0;

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("No money");
			return;
		}

		money -= p.price;
		bonuspoint += p.bonuspoint;
		System.out.println(p+" buying.");
	}
}

class Polyargumenttest {
	public static void main(String args[]) {
		Buyer b = new Buyer();

		b.buy(new Tv());
		b.buy(new Computer());

		System.out.println("your money " + b.money + "$");
		System.out.println("your bonuspoint " + b.bonuspoint);
	}
}
	