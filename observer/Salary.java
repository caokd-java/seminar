/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CaoKD
 * This class is ConcreateSubject
 */
public class Salary implements AccouttingDepartment{
    
    private int salaryMonth;
    private List<Observer> obs = new ArrayList<Observer>();

    public Salary(int salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    @Override
    public void registerObserver(Observer observer) {
        obs.add(observer);
    }

    @Override
    public void refuseObserver(Observer observer) {
        obs.remove(observer);
    }

    @Override
    public void notifyObserver() {
        obs.forEach((observer) -> {
            observer.update(salaryMonth);
        });
    }
    
}
