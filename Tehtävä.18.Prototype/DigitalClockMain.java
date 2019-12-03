public class DigitalClockMain {

	public static void main(String[] args) {
		ClockTimer timer = new ClockTimer();
		DigitalClock clock = new DigitalClock(timer);
		DigitalClock clock2 = clock.clone();
		clock.setMinutes(5);
		System.out.println(clock == clock2);
		clock2.setMinutes(1);
	}

}
