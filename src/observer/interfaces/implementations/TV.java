/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.interfaces.implementations;

import observer.interfaces.Media;
import observer.interfaces.Observer;

/**
 *
 * @author Adrian Juda
 * @version 1.0
 */
public class TV implements Observer, Media{
    private String messages;
    private EmergencyBroadcast emergencyBroadcast;

    /**
     * Constructor for TV
     */
    public TV(EmergencyBroadcast emergencyBroadcast)
    {
        messages = "";
        this.emergencyBroadcast = emergencyBroadcast;
    }
    
    /**
     * updating message
     */
    @Override
    public void update(String message) 
    {
        messages = message;
    }

    /**
     * broadcasting message
     */
    @Override
    public void broadcast()
    {
        System.out.println("We brake today show to announce this "
                + "important message: \n" + messages);
    }
    
    /**
     * removing observer
     */
    public void removeObserver()
    {
        emergencyBroadcast.removeObserver(this);
    }
    
}
