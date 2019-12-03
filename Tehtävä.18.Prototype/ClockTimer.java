package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ClockTimer extends Observable implements Cloneable {
	
	private int hour;
	private int minute;
	private int second;
	private List<Observer> observers;
	
	public ClockTimer() {
		this.observers = new ArrayList<>();
		startClock();
	}
	
	public void attach(Observer observer) {
		this.observers.add(observer);
	}
	
	private void startClock() {
		new Thread(() -> {
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				tick();
			}
		}).start();
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	void tick() {
		//update clock
		updateClock();
		//notify
		for(Observer o : observers) {
			o.update(this, null);
		}
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	private void updateClock() {
		second++;
		if(second > 59) {
			minute++;
			second = 0;
		}
		if(minute > 59) {
			hour++;
			minute = 0;
		}
	}
	
	@Override
	public ClockTimer clone() {
		try {
			ClockTimer timer = (ClockTimer)super.clone();
			timer.startClock();
			return (ClockTimer)timer;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
