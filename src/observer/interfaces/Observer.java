/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.interfaces;

import java.util.ArrayList;

/**
 *
 * @author Adrian Juda
 * @version 1.0
 */
public interface Observer {
    /**
     * updating broadcasted message
     * @param messages string for messages
     */
    public void update(String messages);
}
