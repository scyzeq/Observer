/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.interfaces.implementations;

import java.util.ArrayList;
import observer.interfaces.Information;
import observer.interfaces.Observer;

/**
 *
 * @author AJuda
 */
public class EmergencyBroadcast implements Information{

    private ArrayList<Observer> observer;
    private String message;
    
    public EmergencyBroadcast()
    {
        observer = new ArrayList<Observer>();
        message = "";
    }
    
    @Override
    public void addObserver(Observer observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeOserver(Observer observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObserver(Observer observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
