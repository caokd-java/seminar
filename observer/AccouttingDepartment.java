/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author CaoKD
 * This class is Subject
 */
public interface AccouttingDepartment {
    void registerObserver(Observer observer);
    void refuseObserver(Observer observer);
    void notifyObserver();
}
