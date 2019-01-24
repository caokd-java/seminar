/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author ominext
 */
public class Employee implements Observer{
    
    private String name;
    private int saraly;

    public Employee(String name, int saraly) {
        this.name = name;
        this.saraly = saraly;
    }
    

    @Override
    public void update(int saralyMonth) {
        System.out.println("Lương tháng " + saralyMonth + " của: " + this.name + " là " + this.saraly);
    }
    
}
