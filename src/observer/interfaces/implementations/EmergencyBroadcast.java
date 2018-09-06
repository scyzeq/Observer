/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.interfaces.implementations;

import java.util.ArrayList;
import java.util.Scanner;
import observer.interfaces.Information;
import observer.interfaces.Observer;

/**
 *
 * @author Adrian Juda
 * @version 1.0
 * Implementation for broadcasting information
 */
public class EmergencyBroadcast implements Information{
    
    private ArrayList<Observer> observerList;
    private String message;
    
    /**
     * constructor for Emergency broadcast
     */
    public EmergencyBroadcast()
    {
        observerList = new ArrayList<Observer>();
        message = "";
    }
    
    /**
     * Implementation of abstract method
     */
    public void addObserver(Observer observer) 
    {
        observerList.add(observer);
    }

    /**
     * Implementation of abstract method
     */
    public void removeObserver(Observer observer) 
    {
        observerList.remove(observer);
    }

    /**
     * Implementation of abstract method notifying all observers
     */
    public void notifyObserver() 
    {
        observerList.forEach(o -> o.update(message));
    }
    
    /**
     * Inserting new message
     */
    public void nextMessage()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter message to display: ");
        message = in.nextLine();        
        notifyObserver();
    }
    
    /**
     * Getter for messages
     */
    public String getMessage()
    {
        return message;        
    }
}
