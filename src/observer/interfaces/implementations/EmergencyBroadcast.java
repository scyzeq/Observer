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
 * @author AJuda
 */
public class EmergencyBroadcast implements Information{

    private ArrayList<Observer> observerList;
    private String message;
    
    public EmergencyBroadcast()
    {
        observerList = new ArrayList<Observer>();
        message = "";
    }
    
    
    public void addObserver(Observer observer) 
    {
        observerList.add(observer);
    }

    
    public void removeObserver(Observer observer) 
    {
        observerList.remove(observer);
    }

    
    public void notifyObserver() 
    {
        observerList.forEach(o -> o.update(message));
    }
    
    public void nextMessage()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter message to display: ");
        message = in.nextLine();        
        notifyObserver();
    }
    
    public String getMessage()
    {
        return message;        
    }
}
