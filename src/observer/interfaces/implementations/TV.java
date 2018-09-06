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
 * @author AJuda
 */
public class TV implements Observer, Media{
    private String messages;
    private EmergencyBroadcast emergencyBroadcast;

    
    public TV(EmergencyBroadcast emergencyBroadcast)
    {
        messages = "";
        this.emergencyBroadcast = emergencyBroadcast;
    }
    
    @Override
    public void update(String message) 
    {
        messages = message;
    }

    @Override
    public void broadcast()
    {
        System.out.println("We brake today show to announce this "
                + "important message: \n" + messages);
    }
    
    public void removeObserver()
    {
        emergencyBroadcast.removeObserver(this);
    }
    
}
