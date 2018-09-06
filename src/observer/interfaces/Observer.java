/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.interfaces;

import java.util.ArrayList;

/**
 *
 * @author AJuda
 */
public interface Observer {
    
    public void update(ArrayList<Integer> messages);
}
