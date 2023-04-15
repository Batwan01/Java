class Card {
	final int NUMBER; //상수지만 선언과 함께 초기화 하지 않고
	final String KIND; //생성자에서 단 한번만 초기화할 수 있다.

	card(String Kind, int num) {
		KIND = Kind;
		NUMBER = num;
	}
}
class Finalcardtest {
	public static void main (String args[]) {
		Card c = new Card("Heart",10);
		//c.NUMBER = 5; //오류 발생
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}
}