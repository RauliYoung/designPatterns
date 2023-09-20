package com.observer.tehtava4.clock;

import java.time.Clock;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author rauliyoung
 */
public class DigitalClock implements Observer {
    
    private Timer timer;

    public DigitalClock() {
        this.timer = new Timer();
        timer.addObserver(this);
        Thread timerThread =new Thread(this.timer);
        timerThread.start();
    }
    
    

    @Override
    public void update(Observable o, Object arg) {
        
    }
    
}
