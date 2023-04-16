class Castingtest {
	public static void main(String args[]) {
		Car car = null;
		Fireengine fe = new Fireengine();
		Fireengine fe2 = null;

		fe.water();
		car = fe; // car - c=(car)fe;
		//car.water(); -> 에러 car이랑 Fireengine관계가 없음.
		fe2 = (Fireengine)car; //자손 <- 조상
	}
}

class Car {
	String color;
	int door;

	void drive() {
		System.out.println("dirve, brrrr~");
	}

	void stop() {
		System.out.println("stop!!!");
	}
}

class Fireengine extends Car {
	void water() {
		System.out.println("water!!!!");
	}
}