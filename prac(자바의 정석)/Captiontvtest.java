class Tv{
	boolean power;
	int channel;

	void power() { power = !power; }
	void channelup() { ++channel; }
	void channeldown() { --channel; }
}

class Captiontv extends Tv {
	boolean caption;
	void displaycaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

class Captiontvtest {
	public static void main(String args[]) {
		Captiontv ctv = new Captiontv();
		ctv.channel = 10;
		ctv.channelup();
		System.out.println(ctv.channel);
		ctv.displaycaption("Hello, world");
		ctv.caption = true;
		ctv.displaycaption("Hello, world");
	}
}