/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.observer.tehtava4.clock;

import com.observer.tehtava4.subject.Subject;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DateFormatter;

/**
 *
 * @author rauliyoung
 */
public class Timer extends Subject implements Runnable{
     
     private Clock clock ;
    
     private int kesto = 0;
    
    public void tick() {
        notifyObservers();
    }
    
 
    @Override
    public void run() {
        while(kesto < 100){
            try {
                System.out.println(LocalTime.now(clock.systemDefaultZone()));
                Thread.sleep(1000);
                tick();
                kesto++;
            } catch (InterruptedException ex) {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
}
