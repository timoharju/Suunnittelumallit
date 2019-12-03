import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer, Cloneable{
	
	private ClockTimer timer;
	
	public DigitalClock(ClockTimer ct) {
		this.timer = ct;
		timer.attach(this);
	}

	@Override
	public void update(Observable subject, Object arg1) {
		if(timer == subject) {
			draw();
		}
	}
	
	private void draw() {
		String hours = String.format("%02d", timer.getHour());
		String mins = String.format("%02d", timer.getMinute());
		String secs = String.format("%02d", timer.getSecond());
		System.out.println(hours + ":" + mins + ":" + secs);
	}
	
	public void setMinutes(int minutes) {
		timer.setMinute(minutes);
	}
	
	@Override
	public DigitalClock clone() {
		DigitalClock clock = null;
		try {
			clock = (DigitalClock)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		clock.timer = this.timer.clone();
		clock.timer.attach(clock);
		return clock;
	}

}
