package com.company;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer{

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

}