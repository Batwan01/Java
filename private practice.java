public class Time {
	private int hour;
	private int minute;
	private int second;

	public int get Hour() { return hour; }
	public void sethour ( int hour ) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	public int getminute() { return minute; }
	public void setminute(int minute) {
		if(minute<0 || minute>59) return;
		this.minute = minute;
	}
	public int gersecond() { return second; }
	public void setsecond(int second) {
		if (second < 0 || second > 59) return;
		this.second = second;
	}
}
