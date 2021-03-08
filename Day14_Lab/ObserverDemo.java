/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day14_Lab;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Nagarajan
 */
public class ObserverDemo {

    public static void main(String[] args) {
        
        Monitor monitor = new Monitor();
        monitor.addObserver(new MyObs1());
        monitor.addObserver(new MyObs2());
        monitor.setAlarm();
        
    }
}

class Monitor extends Observable{
    
    public void setAlarm()
    {
        setChanged();
        notifyObservers("The State has Changed...");
    }
}
class MyObs1 implements Observer {

    public void doWork(){
        System.out.println("Preparing to do the Work...");
        System.out.println("Working in progress ...");
    }
    @Override
    public void update(Observable o, Object arg) {
        doWork();
    }
}

class MyObs2 implements Observer {

    public void doTask(){
        System.out.println("Preparing to do the Task...");
        System.out.println("Completing the Task ...");
    }
    @Override
    public void update(Observable o, Object arg) {
        doTask();
    }
}
