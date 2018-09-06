/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.interfaces;

/**
 *
 * @author Adrian Juda
 * @version 1.0
 * Interface with methods for informing observer
 */
public interface Information {
    /**
     * Method for adding observer
     */
    public void addObserver(Observer observer);
    /**
     * Method for removing observer
     */
    public void removeObserver(Observer observer);
    /**
     * Method for notifying observer
     */
    public void notifyObserver();
}
