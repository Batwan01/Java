class Product {
	int price;
	int bonuspoint;

	Product(int price) {
		this.price = price;
		bonuspoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
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
	