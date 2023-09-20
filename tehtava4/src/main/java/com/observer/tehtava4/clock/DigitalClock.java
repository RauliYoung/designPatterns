package com.observer.tehtava4.clock;

import java.time.Clock;
import java.time.LocalTime;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author rauliyoung
 */
public class DigitalClock implements Observer {
    private static int CLOCKID = 0;
    private Timer timer;
    private int id;
    public DigitalClock() {
        this.timer = new Timer();
        timer.addObserver(this);
        Thread timerThread =new Thread(this.timer);
        timerThread.start();
        this.id = CLOCKID;
        CLOCKID++;
    }
    
    

    @Override
    public void update(Observable o, Object arg) {
        if(o == timer) {
          System.out.println("Kello " + id + " " + LocalTime.now(timer.getClock().systemDefaultZone()));  
        }
        
    }
    
}
