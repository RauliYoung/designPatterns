/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.observer.tehtava4.clock;

import com.observer.tehtava4.subject.Subject;
import java.time.Clock;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author rauliyoung
 */
public class Timer extends Subject implements Runnable{
     
     private Clock clock ;

    public Clock getClock() {
        return clock;
    }
    
     private int kesto = 0;
    
    public void tick() {
        notifyObservers();
    }
    
 
    @Override
    public void run() {
        while(kesto < 100){
            try {
                Thread.sleep(1000);
                tick();
                kesto++;
            } catch (InterruptedException ex) {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
    
    
}
