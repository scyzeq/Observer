/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import observer.interfaces.implementations.EmergencyBroadcast;
import observer.interfaces.implementations.Internet;
import observer.interfaces.implementations.Radio;
import observer.interfaces.implementations.TV;

/**
 *
 * @author AJuda
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EmergencyBroadcast emergencyBroadcast = new EmergencyBroadcast();
        TV tv = new TV(emergencyBroadcast);
        Radio radio = new Radio(emergencyBroadcast);
        Internet internet =  new Internet(emergencyBroadcast);
        
        emergencyBroadcast.addObserver(internet);
        emergencyBroadcast.addObserver(internet);
        emergencyBroadcast.addObserver(tv);
        emergencyBroadcast.addObserver(radio);
        emergencyBroadcast.addObserver(internet);
        
        emergencyBroadcast.nextMessage();
        internet.broadcast();
        radio.broadcast();
        tv.broadcast();
        
        //Since no one is listening from radio message is not getting updated
        radio.removeObserver();
        emergencyBroadcast.nextMessage();
        internet.broadcast();
        radio.broadcast();
        tv.broadcast();
        
        
        
    }
    
}
