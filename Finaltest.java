final class Finaltest { //조상이 될 수 없는 클래스
	final int MAX_SIZE = 10; //값을 변경할 수 없는 멤버변수(상수)

	final void getMaxsize() { //오버라이딩할 수 없는 메서드(변경 불가능)
		final int LV = MAX_SIZE; // 값을 변경할 수 없는 지역변수 (상수)
		return MAX_SIZE;
	}
}