package com.observer.tehtava4.subject;

import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

/**
 *
 * @author rauliyoung
 */
public class Subject extends Observable {
    
    private Set<Observer> subjects = new HashSet<>();

    @Override
    public void notifyObservers() {
        for(Observer subject : subjects) {
            subject.update(this, this);
        }
    }
    
    @Override
    public synchronized void addObserver(Observer o) {
        this.subjects.add(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        this.subjects.remove(o);
    }
    
}
